/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : SynThreadA.java, v 0.1 2020年06月09日 10:06 下午 shaobin Exp $
 */
public class SynImproveThreadB extends Thread {

    private SynImproveTask synImproveTask;


    public SynImproveThreadB(SynImproveTask synImproveTask) {
        this.synImproveTask = synImproveTask;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime1 = System.currentTimeMillis();
        synImproveTask.doLongTimeTask();
        CommonUtils.endTime1 = System.currentTimeMillis();
    }
}