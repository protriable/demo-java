package com.protry.thread;

public class ThreadTestOne extends Thread {

    private int i = 20;

    @Override
    public void run() {
        for (int j = 0; j< i; j++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("i = " + j);
        }
    }

    public static void main(String[] args) {
//        new ThreadTestOne().run();
//        new ThreadRunnable().run();


        new Thread(new MyRunnable()).start();
        new Thread(new MyRunnable()).start();
    }
}

class ThreadRunnable implements Runnable {

    @Override
    public void run() {
        for (int j = 0; j< 20; j++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("runnable i = " + j);
        }
    }
}

class MyRunnable implements Runnable {

    private static int j = 10000;

    @Override
    public void run() {
        for (int i =0; i< 10000; i++) {
            System.out.println(j--);
        }
    }
}
