package mit.code.payroll;

public class Employee {
	private static int empid = 1;
	private String name , email ;
	protected double salary;
	
	public static void displayEmpid(){
		System.out.println(empid);
	}

	public Employee(String name, String email, double salary) {
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.empid = empid;
		empid++;
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

	public static int getEmpid() {
		return empid;
	}

	public double getSalary() {
		return salary;
	}
	
	public void Calc_salary() {
		System.out.println("Salary :" + salary);
	}
	
	public final void calcIncometax() { //you can overide this function insidd child class ./z
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}
	
	
	

}
