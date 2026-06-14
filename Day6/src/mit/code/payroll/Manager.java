package mit.code.payroll;

public class Manager extends Employee {
private double incentives;
private String Dept;


public Manager(String name, String email, double salary, double incentives, String dept) {
	super(name, email, salary);
	this.incentives = incentives;
	Dept = dept;
}

@Override
public void Calc_salary() {
	System.out.println("Manager Salary:" +(salary+incentives));
}

@Override
public String toString() {
	return super.toString()+"incentives=" + incentives + ", Dept=" + Dept;
}


}
