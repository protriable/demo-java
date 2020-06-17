/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : SynThisTask.java, v 0.1 2020年06月16日 10:29 下午 shaobin Exp $
 */
public class SynThisTask {

    public void otherMethod() {
        System.out.println(" ------- run Thread ------");
    }

    public void doLongTimeTask() {
        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
                System.out.println("synchronized threadName=" +
                        Thread.currentThread().getName()+ " i=" + i);
            }
        }
    }
}