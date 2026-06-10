package com.tester;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.util.ConnectionUtil;

public class MenuDriven {

	public static void main(String[] args) throws SQLException {

		Connection con = ConnectionUtil.getDBConnection();
		System.out.println("1.Show table 2.Add student 3.Update student 4.Delete student");

		Scanner sc = new Scanner(System.in);
		Student std=new Student();

		int ch;

		do {
			System.out.println("Enter choice");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				std.show();
				break;
			case 2:
				System.out.println("Enter rollno name city marks");
				std.add(sc.nextInt() , sc.next() , sc.next() ,sc.nextDouble());
				break;
				
			case 3:
				
				System.out.println("enyter roll no to update");
				int rollno1 = sc.nextInt();
				
				System.out.println("Enter new  name city marks");
				std.update(rollno1 ,sc.next() ,sc.next(), sc.nextDouble());
				break;
				
			case 4:
				System.out.println("enyter roll no to delete");
				std.delete(sc.nextInt());
				break;

			}

		} while (ch != 0);
		sc.close();
		
		con.close();

	}

}
