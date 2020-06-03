/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.test;

/**
 * 通过状态位来判断
 * @author shaobin
 * @version : Demo4.java, v 0.1 2020年05月27日 9:55 下午 shaobin Exp $
 */
public class Demo4 extends Thread {
    public volatile static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            try {
                while (flag) { // 判断是否运行
                    System.out.println("运行中");
                    Thread.sleep(1000L);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        // 3秒之后，将状态标志改为False，代表不继续运行
        Thread.sleep(3000L);
        flag = false;
        System.out.println("程序运行结束");
    }
}
