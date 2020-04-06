/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.service.impl;

import com.protry.service.HelloService;

/**
 * @author shaobin
 * @version : HelloServiceImpl.java, v 0.1 2020年04月05日 10:04 上午 shaobin Exp $
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        System.out.println(" hello " + name);
    }
}