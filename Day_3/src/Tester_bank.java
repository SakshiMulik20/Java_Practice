import java.util.Scanner;

public class Tester_bank {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id , name , email , balance ");
		int id = sc.nextInt();
		String name = sc.next();
		String email = sc.next();
		double balance= sc.nextDouble();
		
		Bank_Application acc1=new Bank_Application();
		acc1.create_account(id, name, email, balance);
		acc1.show_details();
		
		System.out.println("ENter amount to withdraw");
		double amount =sc.nextDouble();
		
		acc1.withdraw(amount);
		double current_balance = acc1.get_balance();
		System.out.println("The current balance is " + current_balance);
		
		System.out.println();
		System.out.println();
		Bank_Application acc2=new Bank_Application();
		acc2.create_account(20 ,"Sakshi" , "sakshi.mulik20@gmail.com" , 10000);
		acc2.show_details();
		acc2.deposit(5000);
		
	}

}
