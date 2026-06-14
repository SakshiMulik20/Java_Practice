package my.block;

import java.util.Scanner;

public class Student_tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Student.displayClgName();
		System.out.println("Enter student details");
		Student s=new Student(sc.nextInt(),sc.next(),sc.nextDouble());
		
		System.out.println(s);
		

	}

}
