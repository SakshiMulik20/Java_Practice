package leave.pojo;

public class LeaveRequest {
	
	private int lid, empid;
    private String empName, leavetype, fromdate, todate, reason, status;
	public LeaveRequest(int lid, int empid, String empName, String leavetype, String fromdate, String todate,
			String reason, String status) {
		this.lid = lid;
		this.empid = empid;
		this.empName = empName;
		this.leavetype = leavetype;
		this.fromdate = fromdate;
		this.todate = todate;
		this.reason = reason;
		this.status = status;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getLeavetype() {
		return leavetype;
	}
	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
	}
	public String getFromdate() {
		return fromdate;
	}
	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}
	public String getTodate() {
		return todate;
	}
	public void setTodate(String todate) {
		this.todate = todate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "lid=" + lid + ", empid=" + empid + ", empName=" + empName + ", leavetype=" + leavetype
				+ ", fromdate=" + fromdate + ", todate=" + todate + ", reason=" + reason + ", status=" + status;
	}
    
    
	

}
