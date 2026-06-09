package my.student;

public class Student {
	private int sid;
	private String name , email;
	private double percentage;
	
	public Student() {
		System.out.println("Default constructor");
	}
	
	public Student(int sid, String name , String email , double percentage) {
		this.sid=sid;
		this.name = name ;
		this.email=email;
		this.percentage=percentage;
	}
	
	public int getId() {
		return sid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name ;
	}
	
	public String getEmail() {
		return email;
		
	}
	
	public void setEmail(String email) {
		this.email = email ;
	}
	
	public double getPercentage() {
		return percentage;
		
	}
	
	public void setPercentage(double percentage) {
		this.percentage=percentage;
	}
	
	public String toString() {
		return "Id :" + sid + "\nName :" + name + "\nEmail :" + email +"\nPercentage :" + percentage;
	}

}
