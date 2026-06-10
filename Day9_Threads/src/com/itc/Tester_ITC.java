package com.itc;

public class Tester_ITC {

	public static void main(String[] args) throws InterruptedException {
		
		Account act1 =new Account(20 ,"sakshi" , 5000);
		
		Deposite_Operation t1=new Deposite_Operation(act1);
		t1.setPriority(1
				);
		
		Withdraw t2=new Withdraw(act1);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		

	}

}
