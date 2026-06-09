
public class Employee {
	private int id ;
	private String name, email;
	private double salary;
	
	
	//default constructor
	public Employee() {
		System.out.println("Default constructor");
		id = 1 ;
		name = "sakshi";
		email = "abc";
		salary = 10000;
		
	}
	
	//parameterized constructor
	public Employee(int id ,String name ,String email , double salary) {
		System.out.println("Paramterised constructor");
		this.id = id ;
		this.name=name;
		this.email=email;
		this.salary=salary;
	}
	
	public void print() {
		System.out.println("Id :" + id + "\nname :" + name +"\nemail :" + email + "\nsal :" + salary);
	}
	
}
