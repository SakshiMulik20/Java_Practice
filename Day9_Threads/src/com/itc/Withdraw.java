package com.itc;

public class Withdraw extends Thread {

private Account act;
	
	
	public Withdraw(Account act) {
		this.act=act;
		System.out.println("Thread get Created\n");
		
	}
	
	//run method is empty ,does nothing 
	
	public void run() {
		try {
			System.out.println("Withdraw thread started\n");
			
			Thread.sleep(2000);
			act.withdraw(7000);
			
			System.out.println("Withdraw Thread over\n");
		}catch(Exception e ) {
			System.err.println("Error:"+e.getMessage());
		}
	}
	
}
