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


    public static void main(String[] args) throws InterruptedException {
        test19();
    }

    public static void test19() {
        SynTask synTask = new SynTask();
        SynThreadA synThreadA = new SynThreadA(synTask);
        SynThreadB synThreadB = new SynThreadB(synTask);
        synThreadA.start();
        synThreadB.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long beginTime = CommonUtils.beginTime1;
        if (CommonUtils.beginTime1 > CommonUtils.beginTime2) {
            beginTime = CommonUtils.beginTime2;
        }
        long endTime = CommonUtils.endTime1;
        if (CommonUtils.endTime1 < CommonUtils.endTime2) {
            endTime = CommonUtils.endTime2;
        }
        System.out.println("花费了" + (endTime-beginTime)/1000);
    }

    public static void test18() throws InterruptedException {
        PublicVar publicVar = new PublicVar();
        PublicVarThread thread = new PublicVarThread(publicVar);
        thread.start();
        Thread.sleep(500);
        publicVar.getValue();
    }

    private static void test17() {
        MethodLockObject methodLockObject = new MethodLockObject();
        MethodLockThreadA methodLockThreadA = new MethodLockThreadA(methodLockObject);
        MethodLockThreadB methodLockThreadB = new MethodLockThreadB(methodLockObject);
        methodLockThreadA.start();
        methodLockThreadB.start();
    }

    private static void test16() {
        HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
        HasSelfPrivateThreadA threadA = new HasSelfPrivateThreadA(hasSelfPrivateNum);
        HasSelfPrivateThreadB threadB = new HasSelfPrivateThreadB(hasSelfPrivateNum);
        threadA.start();
        threadB.start();
    }

    private static void test15() throws InterruptedException {
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.start();
        Thread.sleep(5000);
        System.out.println("我离开thread对象也就不再打印了，也就停止了");
    }

    private static void test14() {
        try {
            RunThreadA runThreadA = new RunThreadA();
            RunThreadB runThreadB = new RunThreadB();
            runThreadA.setPriority(Thread.NORM_PRIORITY -3);
            runThreadB.setPriority(Thread.NORM_PRIORITY +3);
            runThreadA.start();
            runThreadB.start();
            Thread.sleep(20000);
            runThreadA.stop();
            runThreadB.stop();
            System.out.println("a=" + runThreadA.getCount());
            System.out.println("b=" + runThreadB.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void test13() {
        System.out.println("main priority is" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main priority is now" + Thread.currentThread().getPriority());

        PriorityThread thread = new PriorityThread();
        thread.start();
    }

    private static void test12() throws InterruptedException {
        SuspendThread thread = new SuspendThread();
        thread.start();
        Thread.sleep(5000);

        thread.suspend();
        System.out.println("A=" + System.currentTimeMillis() + " i=" + thread.getI());
        Thread.sleep(5000);
        System.out.println("A=" + System.currentTimeMillis() + " i=" + thread.getI());

        thread.resume();
        Thread.sleep(5000);
        thread.suspend();
        System.out.println("B=" + System.currentTimeMillis() + " i=" + thread.getI());
        Thread.sleep(5000);
        System.out.println("B=" + System.currentTimeMillis() + " i=" + thread.getI());



    }

    private static void testEleven() throws InterruptedException {
        ReturnInterruptThread thread = new ReturnInterruptThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
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