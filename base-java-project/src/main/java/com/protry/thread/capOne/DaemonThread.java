/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : DaemonThread.java, v 0.1 2020年06月07日 8:43 下午 shaobin Exp $
 */
public class DaemonThread extends Thread {

    private int i =0;

    @Override
    public void run() {
        try {
            while (true) {
                i ++;
                System.out.println("i=" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}