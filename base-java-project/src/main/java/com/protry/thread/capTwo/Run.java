/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.thread.capTwo;

/**
 * @author shaobin
 * @version : Run.java, v 0.1 2020年06月22日 8:23 下午 shaobin Exp $
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        test4();
    }

    private static void test4() throws InterruptedException {
        DealThread dealThread = new DealThread();
        dealThread.setFlag("a");
        new Thread(dealThread).start();
        Thread.sleep(100);
        dealThread.setFlag("b");
        new Thread(dealThread).start();
    }

    private static void test1() {
        SyncService syncService1 = new SyncService();
        SyncService syncService2 = new SyncService();
        SyncService syncService3 = new SyncService();
        new Thread(() -> syncService1.printA(),"A").start();
        new Thread(() -> syncService2.printB(),"B").start();
        new Thread(() -> syncService3.printC(),"C").start();
    }

    private static void test2() {
        String a="a";
        String b="a";
        System.out.println(a==b);
    }

    private static void test3() {
        SyncService syncService = new SyncService();
        new Thread(() -> syncService.methodA(),"A").start();
        new Thread(() -> syncService.methodB(),"B").start();
    }
}