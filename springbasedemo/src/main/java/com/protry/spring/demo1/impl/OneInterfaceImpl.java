package com.protry.spring.demo1.impl;

import com.protry.spring.demo1.OneInterface;

public class OneInterfaceImpl implements OneInterface {
    @Override
    public void hello(String hello) {
        System.out.println("Hello OneInterface: " + hello);
    }
}
