package com.tester;
 
import java.util.ArrayList;
import java.util.Scanner;
 
import com.pojo.Student;
import com.dal.StudentDAO;
 
public class Menudriven_student {
 
	public static void main(String[] args) throws Exception {
 
		Scanner sc = new Scanner(System.in);
		StudentDAO dao = new StudentDAO();
		int ch;
 
		System.out.println("STUDENT REGISTRATION SYSTEM");
		System.out.println("1.Show All  2.Add Student  3.Update Name  4.All Emails  5.Search  6.Delete  7.Count");
 
		do {
			System.out.println("Enter your choice");
			ch = sc.nextInt();
 
			switch (ch) {
 
			case 1:
				ArrayList<Student> all = dao.getAllStudents();
				if (all.size() == 0) {
					System.out.println("No students found.");
				} else {
					for (Student s1 : all) {
						System.out.println(s1);
					}
				}
				break;
 
			case 2:
				System.out.println("Enter id name email percentage");
			    Student s = new Student(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
			    int added = dao.addStudent(s);
			    if (added > 0)
			        System.out.println("Student added successfully!");
	
				break;
 
			case 3:
				System.out.println("Enter id and new name");
				int updated = dao.updateName(sc.nextInt(), sc.next());
				if (updated > 0)
					System.out.println("Name updated successfully!");
				else
					System.out.println("Student ID not found.");
				break;
 
			case 4:
				ArrayList<String> emails = dao.getAllEmails();
				if (emails.size() == 0) {
					System.out.println("No emails found.");
				} else {
					for (String email : emails) {
						System.out.println("Email: " + email);
					}
				}
				break;
 
			case 5:
				System.out.println("Enter student id");
				Student found = dao.searchById(sc.nextInt());
				if (found != null)
					System.out.println(found);
				else
					System.out.println("No student found.");
				break;
 
			case 6:
				System.out.println("Enter student id to delete");
				int deleted = dao.deleteStudent(sc.nextInt());
				if (deleted > 0)
					System.out.println("Student deleted successfully.");
				else
					System.out.println("Student ID not found.");
				break;
 
 
			default:
				System.out.println("Invalid choice.");
			}
 
		} while (ch != 0); 
 
		sc.close();
	}
}
 

