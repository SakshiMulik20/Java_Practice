package my.student;

import java.util.Scanner;

public class Tester_arrStudent {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student details");
		Student[] stds = new Student[5];
		
//		Student s2 =new Student(1 , "Sakshi" , "sakshi@gami;.com" ,90);
//		Student s3 =new Student(2 , "Rajas" , "rajas@gami;.com" ,99);
//		Student s4 =new Student(3 , "ANu" , "anu@gami;.com" ,30);
//		Student s5 =new Student(4 , "Madhu" , "madhu@gami;.com" ,40);
//		Student s6 =new Student(5 , "Sham" , "sham@gami;.com" ,50);
//		
//		stds[0]=s2;
//		stds[1]=s3;
//		stds[2]=s4;
//		stds[3]=s5;
//		stds[4]=s6;
		
	
		for(int i=0;i<stds.length; i++) {
			Student s1 = new Student(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
			stds[i]=s1;
		}
		
		for(int i=0 ; i<stds.length ; i++) {
			System.out.println(stds[i]);
		}
		
		sc.close();
		
	}

}
