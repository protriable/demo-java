
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : SleepThread.java, v 0.1 2020年06月02日 8:48 下午 shaobin Exp $
 */
public class SleepThread extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("this.currentThread.name=" +Thread.currentThread().getName() + " begin ");
            Thread.sleep(1000);
            System.out.println("this.currentThread.name=" +Thread.currentThread().getName() + " end ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}