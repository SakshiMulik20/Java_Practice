package com.thread1l;

public class Tester_thread {
	public static void main(String[] args) {
		 System.out.println("-------Test_Thread-----");
		 Thread1 t1=new Thread1();
		 t1.setName("Thread1");
	 t1.start();
	 System.out.println("------Test-Thread------");
	 
	 }

}
