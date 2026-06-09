package com.thread4;

public class Thread2 extends Thread{
	
	private Account act;
	public Thread2(Account act) {
		this.act=act;
	}
	
	public void run() {
		System.out.println("\nThread2 started");
		
		act.deposit(1000);
		
		System.out.println("\nThread2 ends");

	}

}
