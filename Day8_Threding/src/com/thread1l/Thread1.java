package com.thread1l;

public class Thread1 extends Thread {


    public void run() {

        System.out.println("--- Thread1 Started ---");

        for (int i = 1; i <= 10; i++) {

            System.out.println(i);

            try {
                Thread.sleep(2000); // 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("--- Thread1 Ended ---");
    }
}