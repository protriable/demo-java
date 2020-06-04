/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.thread.capOne;

import lombok.Getter;
import lombok.Setter;

/**
 * @author shaobin
 * @version : SuspendThread.java, v 0.1 2020年06月04日 9:23 下午 shaobin Exp $
 */
@Getter
@Setter
public class SuspendThread extends Thread {


    private long i=0;

    @Override
    public void run() {
        while (true) {
            i++;
        }
    }
}