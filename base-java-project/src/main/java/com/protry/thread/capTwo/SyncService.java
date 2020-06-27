
package com.protry.thread.capTwo;

/**
 * @author shaobin
 * @version : SyncService.java, v 0.1 2020年06月22日 8:21 下午 shaobin Exp $
 */
public class SyncService {

    Object object = new Object();
    Object object2 = new Object();

    /**
     * SyncService.class锁
     */
    synchronized public static void printA() {
        try {
            System.out.println("begin printA threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end printA threadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public static void printB() {
        System.out.println("begin printB threadName=" + Thread.currentThread().getName());
        System.out.println("end printB threadName=" + Thread.currentThread().getName());
    }

    public static void printC() {
        synchronized (SyncService.class) {
            System.out.println("begin printC threadName=" + Thread.currentThread().getName());
            System.out.println("end printC threadName=" + Thread.currentThread().getName());
        }
    }

    public void methodA() {

        synchronized (object) {
            System.out.println("methodA begin");
            boolean isContinueRun = true;
            while (isContinueRun) {

            }
            System.out.println("methodA end");
        }
    }

    public void methodB() {
        synchronized (object2) {
            System.out.println("methodB begin");
            System.out.println("methodB end");
        }
    }
}