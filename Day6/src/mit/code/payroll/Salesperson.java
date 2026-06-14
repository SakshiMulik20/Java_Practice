package mit.code.payroll;

public class Salesperson extends Employee {
	
	private int pa ,fa , ta;

	public Salesperson(String name, String email, double salary, int pa, int fa, int ta) {
		super(name, email, salary);
		this.pa = pa;
		this.fa = fa;
		this.ta = ta;
	}
	
	public void Calc_salary() {
		System.out.println("Sales person salary : " + (salary + pa + fa + ta));
	}

	@Override
	public String toString() {
		return "Salesperson [pa=" + pa + ", fa=" + fa + ", ta=" + ta + "]";
	}
	
	


}
