package com.thread3;

public class Thread3 implements Runnable {

	@Override
	public void run() {
		System.out.println("started"+Thread.currentThread().getName());
		
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
		}
		System.out.println("end "+Thread.currentThread().getName());
		
	}
	
	

}
