/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author shaobin
 * @version : ReflectService.java, v 0.1 2020年04月05日 9:47 上午 shaobin Exp $
 */
public class ReflectService {

    public void sayHello(String name) {
        System.out.println("hello" + name);
    }

    public static void main(String[] args) {
        try {
            Object service = Class.forName(ReflectService.class.getName()).newInstance();
            Method sayHello = service.getClass().getMethod("sayHello", String.class);
            sayHello.invoke(service, "zhangsan");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}