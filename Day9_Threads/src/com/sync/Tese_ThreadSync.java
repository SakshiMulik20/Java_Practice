package com.sync;

public class Tese_ThreadSync {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		Account act=new Account(20,"sakshi" , 5000);
		
		Withdraw t1=new Withdraw(act);
		
		Deposite_Operation t2=new Deposite_Operation(act);
		
		t1.start();
		
		t2.start();
		
		
		t1.join();//main thread wll wait till t1 gets over
		t2.join();
	}

}
