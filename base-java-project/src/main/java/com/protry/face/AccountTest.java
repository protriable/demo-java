/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.face;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author shaobin
 * @version : AccountTest.java, v 0.1 2020年06月26日 2:55 下午 shaobin Exp $
 */
public class AccountTest {

    public static void main(String[] args) {
        Account account = new Account();
        ExecutorService service = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) {
            service.execute(new AddMoneyThread(account, 1));
        }

        service.shutdown();
        while (!service.isTerminated()){}

        System.out.println(account.getBalance());
    }
}