package payroll;

public class Employee {
	private int empid;
	private String name ;
	private double salary;
	
	
	public Employee() {
		System.out.println("--default constructor");
		empid = 1;
		name = "abc";
		salary = 2000;
	}
	
	public Employee(int empid, String name, double salary) {
		System.out.println("----Parametrized constructor");
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		
	}
	
	public void calcSalary()	{
		
	}

    public void display() {
        System.out.println("Empid: " + empid + " Name: " + name + " Salary: " + salary);
    }
	
}
