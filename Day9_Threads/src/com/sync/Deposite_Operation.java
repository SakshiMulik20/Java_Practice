package com.sync;

public class Deposite_Operation extends Thread{
	
	private Account act;
	
	
	public Deposite_Operation(Account act) {
		this.act=act;
		System.out.println("Thread get Created\n");
		
	}
	
	//run method is empty ,does nothing 
	
	public void run() {
		try {
			System.out.println("Deposite thread started\n");
			
			Thread.sleep(2000);
			act.deposit(2000);
			
			System.out.println("Thread over\n");
		}catch(Exception e ) {
			System.err.println("Error:"+e.getMessage());
		}
	}
	

}
