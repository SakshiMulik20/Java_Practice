package leave.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import leave.pojo.LeaveRequest;
import leave.util.ConnectionUtil;

public class LeaveDAO {

    private Connection con;

    public LeaveDAO() throws Exception {
        con = ConnectionUtil.getDbConnection();
        System.out.println("----inside LeaveDAO----obj created----");
    }

    // insert - apply leave
    public int applyLeave(LeaveRequest lr) throws SQLException {
        System.out.println("\n---inside applyLeave-----");
        String sql = "insert into leaverequest(empid,leavetype,fromdate,todate,reason) values(?,?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1,    lr.getEmpid());
        pstmt.setString(2, lr.getLeavetype());
        pstmt.setString(3, lr.getFromdate());
        pstmt.setString(4, lr.getTodate());
        pstmt.setString(5, lr.getReason());
        int i = pstmt.executeUpdate();
        return i;
    }

    // select by employee
    public ArrayList<LeaveRequest> getLeavesByEmp(int empid) throws SQLException {
        System.out.println("\n---inside getLeavesByEmp-----");
        String sql = "select * from leaverequest where empid=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, empid);
        ResultSet rset = pstmt.executeQuery();

        ArrayList<LeaveRequest> list = new ArrayList<LeaveRequest>();
        while (rset.next()) {
            // empName passed as null here - not needed for employee's own view
            LeaveRequest lr = new LeaveRequest(
                    rset.getInt("lid"),
                    rset.getInt("empid"),
                    null,
                    rset.getString("leavetype"),
                    rset.getString("fromdate"),
                    rset.getString("todate"),
                    rset.getString("reason"),
                    rset.getString("status"));
            list.add(lr);
        }
        rset.close();
        return list;
    }

    // select all - for admin (uses JOIN to get empName)
    public ArrayList<LeaveRequest> getAllLeaves() throws SQLException {
        System.out.println("\n---inside getAllLeaves-----");
        String sql = "select lr.lid, lr.empid, e.name, lr.leavetype, lr.fromdate, "
                   + "lr.todate, lr.reason, lr.status "
                   + "from leaverequest lr "
                   + "join employee e on lr.empid=e.empid";

        Statement stmt = con.createStatement();
        ResultSet rset = stmt.executeQuery(sql);

        ArrayList<LeaveRequest> list = new ArrayList<LeaveRequest>();
        while (rset.next()) {
            // all 8 params including empName from JOIN
            LeaveRequest lr = new LeaveRequest(
                    rset.getInt("lid"),
                    rset.getInt("empid"),
                    rset.getString("name"),       // empName from JOIN
                    rset.getString("leavetype"),
                    rset.getString("fromdate"),
                    rset.getString("todate"),
                    rset.getString("reason"),
                    rset.getString("status"));
            list.add(lr);
        }
        rset.close();
        return list;
    }

    // update - approve/reject
    public int updateStatus(int lid, String status) throws SQLException {
        System.out.println("---inside updateStatus------");
        String sql = "update leaverequest set status=? where lid=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, status);
        pstmt.setInt(2, lid);
        int i = pstmt.executeUpdate();
        return i;
    }

    // delete
    public int deleteLeave(int lid) throws SQLException {
        System.out.println("---inside deleteLeave------");
        String sql = "delete from leaverequest where lid=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, lid);
        int i = pstmt.executeUpdate();
        return i;
    }
}