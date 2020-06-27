
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : SynThreadA.java, v 0.1 2020年06月09日 10:06 下午 shaobin Exp $
 */
public class SynImproveThreadA extends Thread {

    private SynImproveTask synImproveTask;


    public SynImproveThreadA(SynImproveTask synImproveTask) {
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