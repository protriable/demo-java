/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.test;

import com.protry.service.HelloService;
import com.protry.service.HelloServiceProxy;
import com.protry.service.impl.HelloServiceImpl;

/**
 * @author shaobin
 * @version : HelloServiceMain.java, v 0.1 2020年04月05日 10:40 上午 shaobin Exp $
 */
public class HelloServiceMain {

    public static void main(String[] args) {
        HelloServiceProxy helloServiceProxy = new HelloServiceProxy();
        HelloService helloService = (HelloService) helloServiceProxy.bind(new HelloServiceImpl());
        helloService.sayHello("张三");
    }
}