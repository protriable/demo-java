/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : CountOperateTest.java, v 0.1 2020年06月01日 9:37 下午 shaobin Exp $
 */
public class CountOperateTest {

    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        countOperate.setName("bb");
        Thread thread = new Thread(countOperate);
        System.out.println("isAlive=" + thread.isAlive());
        thread.setName("aa");
        thread.start();
        System.out.println("isAlive=" + thread.isAlive());
    }
}