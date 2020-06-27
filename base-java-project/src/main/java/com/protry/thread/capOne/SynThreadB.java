
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : SynThreadA.java, v 0.1 2020年06月09日 10:06 下午 shaobin Exp $
 */
public class SynThreadB extends Thread {

    private SynTask synTask;


    public SynThreadB(SynTask synTask) {
        this.synTask = synTask;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime2 = System.currentTimeMillis();
        synTask.doLongTimeTask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}