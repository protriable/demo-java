/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : PriorityThread.java, v 0.1 2020年06月07日 4:40 下午 shaobin Exp $
 */
public class PriorityThread extends Thread {

    @Override
    public void run() {
        System.out.println("PriorityThread's priority is " + this.getPriority());
    }
}