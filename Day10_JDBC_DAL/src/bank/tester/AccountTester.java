package bank.tester;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import bank.dal.AccountDAO;
import bank.pojo.Account;

public class AccountTester {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		AccountDAO actDAO = new AccountDAO();
		Scanner sc = new Scanner(System.in);

		System.out.println("1.Show accounts 2.Enter account 3.Edit 4 .Delete 5.Withdraw 6.Deposite");

		int ch;
		do {
			System.out.println("Enter choice");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				  ArrayList<Account> allActs = actDAO.getAllActs();
	                for (Account act : allActs) {
	                    System.out.println(act);
	                }
				break;
			case 2:
				Account newAct ; 
				 newAct = new Account(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextDouble());
				 actDAO.createNewAccount(newAct);
				break;
			case 3:
				 Account updAct = new Account(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextDouble());
	                actDAO.updateAccount(updAct);
				break;
			case 4:
				actDAO.deleteAccount(sc.nextInt());
				break;
			case 5:
//				System.out.println("enter account to withdraw");
				System.out.println("ENter email and pwd");
				 Account act = actDAO.login(sc.next(), sc.next());
				 System.out.println(act);
				 if (act != null) {
					 System.out.println("Enter amount to withdraw");
					 actDAO.withdraw(act, sc.nextDouble());
				    }
				break;
			case 6:
//				System.out.println("ENter email and pwd that you want to transfer");
//				Account act1 = actDAO.login(sc.next(), sc.next());
//				if(act1!=null) {
//					System.out.println("ENter amount to withdraw");
//					actDAO.withdraw(act1, sc.nextDouble());
//					0
//				}
				break;
			}

		} while (ch != 0);
		
		sc.close();
	}

}
