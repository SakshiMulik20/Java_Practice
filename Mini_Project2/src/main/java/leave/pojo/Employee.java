package leave.pojo;

public class Employee {
	
	private int empid;
    private String name, email, pwd, dept, role;
    
	public Employee(int empid, String name, String email, String pwd, String dept, String role) {
		this.empid = empid;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.dept = dept;
		this.role = role;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "empid=" + empid + ", name=" + name + ", email=" + email + ", pwd=" + pwd + ", dept=" + dept
				+ ", role=" + role;
	}
    
    


}
