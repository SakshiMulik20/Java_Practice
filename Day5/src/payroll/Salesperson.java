package payroll;

public class Salesperson extends Employee {
	
	public String region ;
	public double targetAchieved ;
	public double comissionRate;
	
	public Salesperson() {
		System.out.println("default constructor");
		region = "East";
		targetAchieved = 90.0;
		comissionRate = 80.02;
	}
	
	public Salesperson(int empid , String name ,double salary , String region , double targetAchieved ) {
		System.out.println("Parametrized constructor ");
		super(empid,name,salary);
		this.targetAchieved=targetAchieved;
	}
	
	public void targetAchieved() {
		System.out.println("target achieved " + targetAchieved);
	}
	
	public void display() {
		super.display();
		
	}
}
