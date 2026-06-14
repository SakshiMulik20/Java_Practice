package payroll;

public class Manager extends Employee {
	private double incentives;
	
	public Manager() {
		 System.out.println("--default constructor");
	}
	
	public Manager(int empid , String name , double salary ,double incentives) {
		super(empid , name ,salary);
		this.incentives = incentives;
		System.out.println("--parameter constructor");
	}
	
	public void assignTask() {
		 System.out.println("Task assigned by manager");
	}
	
	
	//same function z: overriding 
	//possible in inhertance only
	public void display() {
		 super.display(); 
	        System.out.println("Incentives: " + incentives);
	}
	

}
