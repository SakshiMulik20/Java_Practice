
public class Employee {
	private int id ;
	private String name ;
	
	public Employee(int i ,String n) {
		System.out.println("Parmetrized constructor");
		
		id = i ;
		name = n;
	}
	public void show() {
		System.out.println("id :" + id + "Name :" + name);
	}
	
}

