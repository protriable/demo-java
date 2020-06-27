
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : SynOneThread.java, v 0.1 2020年06月16日 9:11 下午 shaobin Exp $
 */
public class SynOneThreadB extends Thread {

    private SynOneService synOneService;

    public SynOneThreadB(SynOneService synOneService) {
        this.synOneService = synOneService;
    }

    @Override
    public void run() {
        super.run();
        synOneService.serviceMethod();
    }
}