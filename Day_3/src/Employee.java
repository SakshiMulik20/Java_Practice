
public class Employee {
	private int empid;
	private String name , email;
	private double salary ;
	
	//methods 
	public void calculate_sal() {
		System.out.println("-----Calculate salary --------");
	}
	
	public void assign_details(int id , String nm , String em ,double sal) {
		empid = id ;
		name = nm ;
		email = em ;
		salary = sal;
		System.out.println("-----details assigned------");
	}
	
	public void  display_details() {
		System.out.println(empid);
		System.out.println(name);
		System.out.println(email);
		System.out.println(salary);
		
	}

}
