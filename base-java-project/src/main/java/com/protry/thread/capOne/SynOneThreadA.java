/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : SynOneThread.java, v 0.1 2020年06月16日 9:11 下午 shaobin Exp $
 */
public class SynOneThreadA extends Thread {

    private SynOneService synOneService;

    public SynOneThreadA(SynOneService synOneService) {
        this.synOneService = synOneService;
    }

    @Override
    public void run() {
        super.run();
        synOneService.serviceMethod();
    }
}