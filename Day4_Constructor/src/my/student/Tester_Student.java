package my.student;

import java.util.Scanner;

public class Tester_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter student details");
		Student std=new Student(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
		
		System.out.println(std);
		
		System.out.println("Enter new email");
		String email=sc.next();
		std.setEmail(email);
		
		System.out.println("Updated email is " +std.getEmail());
		System.out.println(std);
		
		sc.close();

	}

}
