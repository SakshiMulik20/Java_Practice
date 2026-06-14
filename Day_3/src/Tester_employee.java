import java.util.Scanner;

public class Tester_employee {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		
		emp.calculate_sal();
		
		System.out.println("Enter id name email and salary");
		int id = sc.nextInt();
		String nm = sc.next();
		String em = sc.next();
		double sal = sc.nextDouble();
		
		emp.assign_details(id, nm, em, sal);
		emp.display_details();
	}

}
