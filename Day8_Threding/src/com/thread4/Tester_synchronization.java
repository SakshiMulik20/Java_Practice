package com.thread4;

public class Tester_synchronization {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thread started ");
		
		Account act1=new Account(101 , "sakshi" , 5000);
		Thread1 bankEmp1=new Thread1(act1);
		bankEmp1.setName("Bank EMp1");
		bankEmp1.start();
		
		Thread2 bankEmp2=new Thread2(act1);
		bankEmp2.setName("Bank EMp2");
		bankEmp2.start();
		
		bankEmp1.join();
		bankEmp2.join();
		System.out.println("Main thread end ");
	}

}
