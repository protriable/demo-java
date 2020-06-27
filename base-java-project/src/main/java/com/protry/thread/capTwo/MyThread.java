/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.thread.capTwo;

/**
 * @author shaobin
 * @version : MyThread.java, v 0.1 2020年06月26日 10:04 下午 shaobin Exp $
 */
public class MyThread extends Thread{

    volatile public static int count ;

    synchronized private static void addCount() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
        System.out.println("count=" + count);
    }

    @Override
    public void run() {
        addCount();
    }
}