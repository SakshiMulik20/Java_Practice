package college;
import java.util.Scanner;

public class Tester_student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] arr=new Student[5];
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("ENter the id , name and marks of the student");
		    Student s1 = new Student(sc.nextInt() , sc.next() , sc.nextDouble());
		    arr[i]=s1;
		}
		
		System.out.println("Student Details\n");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("ID :" + arr[i].getStudentId() +
								"Name :" + arr[i].getStudentName() +
								"Marks : " + arr[i].getMarks());
			
		}

		
		}

}
