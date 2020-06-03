/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : CountOperate.java, v 0.1 2020年06月01日 9:35 下午 shaobin Exp $
 */
public class CountOperate extends Thread{

    public CountOperate() {
        System.out.println("CountOperate---begin");
        System.out.println("ThreadName = " + Thread.currentThread().getName());
        System.out.println("isAlive=" + Thread.currentThread().isAlive());
        System.out.println("this.name =" + this.getName());
        System.out.println("this.isAlive =" + this.isAlive());
    }

    @Override
    public void run() {
        System.out.println("Run---begin");
        System.out.println("ThreadName = " + Thread.currentThread().getName());
        System.out.println("isAlive=" + Thread.currentThread().isAlive());
        System.out.println("this.name =" + this.getName());
        System.out.println("this.isAlive =" + this.isAlive());
    }
}