package com.protry.thread;

public class ThreadTestTwo {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
    }
}

class MyThread implements Runnable {

    private int ticket = 5;
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            if (this.ticket > 0) {
                System.out.println("卖票，ticket = " +this.ticket -- + " threadName = " + Thread.currentThread().getName());
            }
        }
    }
}
