/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : Run.java, v 0.1 2020年05月31日 8:37 下午 shaobin Exp $
 */
public class Run {


    public static void main(String[] args) {
        testTen();
    }

    private static void testTen() {
        SleepInterruptThreadTwo threadTwo = new SleepInterruptThreadTwo();
        threadTwo.start();
        threadTwo.interrupt();
        System.out.println("end!");
    }

    private static void testNine() {
        try {
            SleepInterruptThread thread = new SleepInterruptThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }

    private static void testSeven() {
        try {
            InterruptThreadTwo thread = new InterruptThreadTwo();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("main catch");
        }
        System.out.println("end");
    }

    private static void testSix() {
        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("enter interrupt");
        interruptThread.interrupt();
        System.out.println("this is interrupted 1 ? " + interruptThread.isInterrupted());
        System.out.println("this is interrupted 2 ? " + interruptThread.isInterrupted());

    }

    private static void testFive() {
        Thread.currentThread().interrupt();
        System.out.println("this is interrupted 1 ? " + Thread.currentThread().isInterrupted());
        System.out.println("this is interrupted 2 ? " + Thread.currentThread().isInterrupted());
    }

    /* 共享数据结果*/
    private static void testFour() throws InterruptedException {
        MyThreadOne myThreadOne = new MyThreadOne();
        new Thread(myThreadOne).start();
        new Thread(myThreadOne).start();
        new Thread(myThreadOne).start();
        new Thread(myThreadOne).start();
        new Thread(myThreadOne).start();
    }

    /* 不共享数据结果*/
    private static void testThree() throws InterruptedException {
        MyThreadOne myThreadOne = new MyThreadOne("A");
        MyThreadOne myThreadOne1 = new MyThreadOne("B");
        MyThreadOne myThreadOne2 = new MyThreadOne("C");
        myThreadOne.start();
        myThreadOne1.start();
        myThreadOne2.start();
    }
    private static void testTwo() throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("运行结束!");
    }
    private static void testOne() throws InterruptedException {
        MyThread myThread = new MyThread("MyThread");
        myThread.start();
        for (int i = 0; i < 10; i++) {
            int time = (int) (Math.random()*1000);
            Thread.sleep(time);
            System.out.println("run=" + Thread.currentThread().getName());
        }
        System.out.println("运行结束");
    }
}