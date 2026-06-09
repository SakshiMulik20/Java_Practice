package com.thread3;

public class Thread_lifecycle {

	public static void main(String[] args) throws InterruptedException {
		
		
		Thread3 obj = new Thread3();
		
		Thread t1 = new Thread(obj);
		
		t1.start();
		t1.join(4000);
		
		System.out.println("T! alive " + t1.isAlive());
		System.out.println("Main over");
		
	}

}
