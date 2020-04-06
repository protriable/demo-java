/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.service.impl;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib动态代理
 * @author shaobin
 * @version : HelloServiceCGLIB.java, v 0.1 2020年04月05日 10:50 上午 shaobin Exp $
 */
public class HelloServiceCGLIB implements MethodInterceptor {

    private Object target;


    /**
     * 获取代理对象
     * @param target
     * @return
     */
    public Object getInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        //回调方法
        enhancer.setCallback(this);
        //创建代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("我是CGLIB动态代理");
        //反射方法前调用
        System.out.println("我准备说hello");
        Object invokeSuper = methodProxy.invokeSuper(object, args);
        System.out.println("我说过hello了");
        return invokeSuper;
    }
}