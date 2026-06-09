package my.student;

import java.util.Scanner;

public class Menudriven_student {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add , 2.Show , 3.Update Name ,4.All emails");

		Student[] std = new Student[3];

		int ch;

		do {
			System.out.println("Enter your choice");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter roll no or id then name email and percentage");
				for (int i = 0; i < std.length; i++) {
					Student s1 = new Student(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
					std[i] = s1;
					System.out.println("student added!");
				}
				break;
			case 2:
				for(int i=0 ; i<std.length ; i++) {
					System.out.println(std[i]);
				}
				break;
			case 3:
				System.out.println("Enter id");
				int id = sc.nextInt();
				
				for(int i = 0 ; i<std.length ; i++) {
					if(std[i].getId()==id) {
						System.out.println("Enter new name");
						String name = sc.next();
						
						std[i].setName(name);
						System.out.println("Updates name is "+ std[i].getName());
				}
				}
				break;
			case 4:
				for(int i=0;i<std.length ; i++) {
					System.out.println("EMails" + std[i].getEmail());
				}
				break;

			}
		} while (ch != 0);
		
		sc.close();

	}

}
