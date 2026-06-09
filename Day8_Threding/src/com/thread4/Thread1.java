package com.thread4;

public class Thread1 extends Thread {
	
	private Account act;
	public Thread1(Account act) {
		this.act=act;
	}
	
	public void run() {
		System.out.println("\nThread1 started");
		
		act.withdraw(2000);
		
		System.out.println("\nThread1 ends");

	}

}
