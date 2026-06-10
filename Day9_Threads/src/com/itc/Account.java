package com.itc;

public class Account {

	private int actid;
	private String name;
	private double balance;

	
	public Account(int actid, String name, double balance) {
		this.actid = actid;
		this.name = name;
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Account [actid=" + actid + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	//notify all waiting threads
	public void deposit(double amount) throws InterruptedException {
//		Thread t = Thread.currentThread();
//		System.out.println(t.getName());
//		
		System.out.println("Deposit operation started by " +Thread.currentThread().getName());
		
		balance += amount;
		
		this.notify();
		
		Thread.sleep(2000);
		System.out.println("After deposite:" +balance);
	}
	
	public void withdraw(double amount) throws InterruptedException {
		
	System.out.println("Withdraw operation started by " +Thread.currentThread().getName());
		
		if(balance<amount) {
			System.out.println("Waiting for some deposite to occur");
			this.wait();
		}
		balance -= amount;
		
		Thread.sleep(2000);
		System.out.println("After withdraw:" +balance);
	}
}
