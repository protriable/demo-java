/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.thread.capOne;

/**
 * 锁重入:自己可以再次获取自己的内部锁
 * @author shaobin
 * @version : SynLockInService.java, v 0.1 2020年06月09日 9:16 下午 shaobin Exp $
 */
public class SynLockInService {

    synchronized public void service1() {
        System.out.println("service1");
        service2();
    }

    synchronized public void service2() {
        System.out.println("service2");
        service3();
    }

    synchronized public void service3() {
        System.out.println("service3");
    }
}