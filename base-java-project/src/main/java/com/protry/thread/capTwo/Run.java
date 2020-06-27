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
        test13();
    }

    private static void test13() {
        MyThread[] myThread = new MyThread[100];

        for (int i = 0; i < 100; i++) {
            myThread[i] = new MyThread();
        }
        for (int i = 0; i < 100; i++) {
            myThread[i].start();
        }
    }

    private static void test12() {
        final NewPrintString newPrintString = new NewPrintString();
        new Thread(newPrintString).start();
        System.out.println("我要停止它! stopThread=" + Thread.currentThread().getName());
        newPrintString.setContinuePrint(false);
    }

    /**
     * 停止不了
     */
    private static void test11() {
        final PrintString printString = new PrintString();
        printString.printStringMethod();
        System.out.println("我要停止它! stopThread=" + Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }

    private static void test10() throws InterruptedException {
        final MyService service = new MyService();
        final Thread a = new Thread(() -> service.testMethod(), "A");
        final Thread b = new Thread(() -> service.testMethod(), "B");
        a.start();
        b.start();
    }

    private static void test9() throws InterruptedException {
        final MyService service = new MyService();
        new Thread(() -> service.testMethod(), "A").start();
        Thread.sleep(50);
        new Thread(() -> service.testMethod(), "B").start();
    }

    private static void test8(){
        OutClass.InnerClass1 innerClass1 = new OutClass.InnerClass1();
        OutClass.InnerClass2 innerClass2 = new OutClass.InnerClass2();
        Thread thread1 = new Thread(() -> innerClass1.method1(innerClass2),"A");
        Thread thread2 = new Thread(() -> innerClass1.method2(),"B");
        Thread thread3 = new Thread(() -> innerClass2.method1(),"C");
        thread1.start();
        thread2.start();
        thread3.start();
    }

    private static void test7() {
        OutClass.Inner inner = new OutClass.Inner();
        new Thread(()->inner.method1(),"A").start();
        new Thread(()->inner.method2(),"B").start();
    }

    private static void test6() {
        PublicClass publicClass = new PublicClass();
        publicClass.setPassword("passwordValue");
        publicClass.setUsername("usernameValue");
        System.out.println(publicClass.getUsername() + " " + publicClass.getPassword());

        PublicClass.PrivateClass privateClass = publicClass.new PrivateClass();
        privateClass.setAge("15");
        privateClass.setAddress("杭州");
        System.out.println(privateClass.getAge() + " " + privateClass.getAddress());
        PublicClass.PrivateClassTwo privateClassTwo = new PublicClass.PrivateClassTwo();
    }

    private static void test5() {
        char a = '中';
        System.out.println(a);
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