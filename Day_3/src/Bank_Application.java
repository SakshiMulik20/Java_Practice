
public class Bank_Application {
	private int accid ;
	private String name , email;
	private double balance;
	
	public void create_account(int id ,String nm , String em , double bl) {
		accid = id ;
		name = nm ;
		email = em;
		balance = bl;
	}
	
	public void show_details() {
		System.out.println("Bank Details\n");
		System.out.println("Account id :"+  accid );
		System.out.println("Holder name :"+  name );
		System.out.println("Email :"+  email );
		System.out.println("Balance :"+  balance );
	}
	
	public void withdraw(double amount) {
		System.out.println("Enter amount to withdraw");
		balance -= amount;
		System.out.println("The current balance is "+balance);
	}
	
	public void deposit(double amount) {

		balance += amount;
		System.out.println("The current balance is "+balance);
	}
	
	public double get_balance() {
		System.out.println("Balance details ");
		return balance;
	}

}
