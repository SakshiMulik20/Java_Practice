package my.block;

public class Student {
	private int sid;
	private String name;
	private double percentage;
	
	private static String clgName;
	
	static {
		System.out.println("This is static block");
		clgName="MIT ADT";

	}
	
	public static void displayClgName() {
		System.out.println("The clg name is "+clgName);
	
	}

	public Student(int sid, String name, double percentage) {
		this.sid = sid;
		this.name = name;
		this.percentage = percentage;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "sid=" + sid + ", name=" + name + ", percentage=" + percentage;
	}
	
	
	

}
