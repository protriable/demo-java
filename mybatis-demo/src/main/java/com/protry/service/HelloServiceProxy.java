/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.service;

import com.protry.service.HelloService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 * @author shaobin
 * @version : HelloServiceProxy.java, v 0.1 2020年04月05日 10:05 上午 shaobin Exp $
 */
public class HelloServiceProxy implements InvocationHandler {

    private Object target;

    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是JDK动态代理");
        Object result = null;
        //反射方法调用前
        System.out.println("我准备说hello");
        result = method.invoke(target, args);
        System.out.println("我说过hello了");
        return result;
    }
}