/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.face;

import java.util.concurrent.Callable;

/**
 * @author shaobin
 * @version : CallableTask.java, v 0.1 2020年06月26日 3:18 下午 shaobin Exp $
 */
public class CallableTask implements Callable<Integer> {

    private int upperBounds;

    public CallableTask(int upperBounds) {
        this.upperBounds = upperBounds;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < upperBounds; i++) {
            sum += upperBounds;
        }
        return sum;
    }
}