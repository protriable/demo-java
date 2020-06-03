/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.thread.capOne;

/**
 * 在sleep的时候被interrupt了
 * @author shaobin
 * @version : SleepInterruptThread.java, v 0.1 2020年06月02日 10:02 下午 shaobin Exp $
 */
public class SleepInterruptThread extends Thread {

    @Override
    public void run() {
        System.out.println("begin");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            System.out.println("在沉睡中进入catch阶段" + this.isInterrupted());
            e.printStackTrace();
        }
        System.out.println("end");
    }
}