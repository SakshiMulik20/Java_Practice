import java.util.Scanner;

public class Tester_Employee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		emp.print();
		
//		Employee emp1=new Employee(20 , "Skashi" , "abc@gamil.com" , 20000);
//		emp1.print();
		
		System.out.println("ENter the employee details");
		Employee emp1 = new Employee(sc.nextInt() ,sc.next() , sc.next() , sc.nextDouble());
		emp1.print();
		
		sc.close();

	}

}
