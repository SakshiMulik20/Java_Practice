package com.thread2;

public class EvenThread implements Runnable {

    @Override
    public void run() {

        System.out.println("Even thread started " + Thread.currentThread().getName());

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
