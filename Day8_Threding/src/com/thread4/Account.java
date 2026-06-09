package com.thread4;

public class Account {
	
	private int actid;
	private String name;
	private double balance;

	
	public Account(int actid, String name, double balance) {
		this.actid = actid;
		this.name = name;
		this.balance = balance;
	}


	public int getActid() {
		return actid;
	}


	public void setActid(int actid) {
		this.actid = actid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Account [actid=" + actid + ", name=" + name + ", balance=" + balance + "]";
	}
	
	public synchronized void deposit(double amount) {
		System.out.println("Deposit operation started by :" +Thread.currentThread().getName());
		
		balance=balance+amount;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("deposit operation ended by :"+ Thread.currentThread().getName());
		System.out.println(balance);
		
	}
	
	public synchronized void withdraw(double amount) {
		System.out.println("Withdraw started :"+Thread.currentThread().getName());
		
		balance=balance-amount;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("withdraw ended :"+Thread.currentThread().getName());
		System.out.println(balance);
	}
}
