package com.thread2;

public class Test_evenThread {

	public static void main(String[] args) {
		
		EvenThread even = new EvenThread();
		
		Thread t1 = new Thread(even);
	
		t1.start();
		t1.setName("Even numbers ");
		System.out.println("main end");
	}
}
