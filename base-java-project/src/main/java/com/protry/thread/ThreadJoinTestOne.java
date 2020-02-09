package com.protry.thread;

public class ThreadJoinTestOne extends Thread{

    private int i;
    private Thread previousThread;

    public ThreadJoinTestOne(Thread previousThread, int i) {
        super();
        this.i = i;
        this.previousThread = previousThread;
    }

    @Override
    public void run() {
        try {
          //调用上一个线程的join方法
          this.previousThread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("num =" + i);
    }

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            ThreadJoinTestOne threadJoinTestOne = new ThreadJoinTestOne(thread, i);
            threadJoinTestOne.start();
            thread = threadJoinTestOne;
        }
    }
}
