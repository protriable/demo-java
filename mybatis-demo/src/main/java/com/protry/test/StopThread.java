/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.test;

/**
 * @author shaobin
 * @version : StopThread.java, v 0.1 2020年05月27日 9:38 下午 shaobin Exp $
 */
public class StopThread extends Thread {
    private int i = 0, j = 0;

    @Override
    public void run() {
        synchronized (this) {
            // 增加同步锁，确保线程安全
            ++i;
            try {
                // 休眠10秒,模拟耗时操作
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ++j;
        }
    }

    /** * 打印i和j */
    public void print() {
        System.out.println("i=" + i + " j=" + j);
    }
}