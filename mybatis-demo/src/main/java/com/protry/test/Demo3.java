/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.test;

/**
 * @author shaobin
 * @version : Demo3.java, v 0.1 2020年05月27日 9:38 下午 shaobin Exp $
 */
public class Demo3 {

    public static void main(String[] args) throws InterruptedException {
        StopThread thread = new StopThread();
        thread.start();
        // 休眠1秒，确保i变量自增成功
        Thread.sleep(1000);
        // 暂停线程
//          thread.stop(); // 错误的终止
        thread.interrupt(); // 正确终止
        while (thread.isAlive()) {
            // 确保线程已经终止
        } // 输出结果
        thread.print();
    }
}