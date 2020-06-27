
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : SynThreadA.java, v 0.1 2020年06月09日 10:06 下午 shaobin Exp $
 */
public class SynThreadA extends Thread {

    private SynTask synTask;


    public SynThreadA(SynTask synTask) {
        this.synTask = synTask;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime1 = System.currentTimeMillis();
        synTask.doLongTimeTask();
        CommonUtils.endTime1 = System.currentTimeMillis();
    }
}