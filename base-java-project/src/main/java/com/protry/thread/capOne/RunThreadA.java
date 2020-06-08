/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.thread.capOne;

import lombok.Getter;

/**
 * @author shaobin
 * @version : RunThreadA.java, v 0.1 2020年06月07日 8:30 下午 shaobin Exp $
 */
@Getter
public class RunThreadA extends Thread {

    private int count = 0;
    @Override
    public void run() {
        while (true) {
            count++;
        }
    }
}