/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.thread.capTwo;

/**
 * @author shaobin
 * @version : OutClass.java, v 0.1 2020年06月23日 9:19 下午 shaobin Exp $
 */
public class OutClass {

    static class InnerClass1{
        public void method1(InnerClass2 innerClass2) {
            String threadName = Thread.currentThread().getName();
            synchronized (innerClass2) {
                System.out.println(threadName + "进入InnerClass1的method1方法");
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " i="+i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(threadName + "离开InnerClass1的method1方法");
            }
        }

        public synchronized void method2() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "进入InnerClass1的method2方法");
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " i="+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + "离开InnerClass1的method2方法");
        }
    }

    static class InnerClass2{
        public synchronized void method1() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "进入InnerClass2的method1方法");
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " i="+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + "离开InnerClass2的method1方法");
        }
    }

    static class Inner{
        public void method1() {
            synchronized ("其它的锁") {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() +
                            " i="+i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public void method2() {
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() +
                        " i="+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}