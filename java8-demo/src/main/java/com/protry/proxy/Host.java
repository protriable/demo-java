package com.protry.proxy;

/**
 * 房东:被代理类
 */
public class Host implements RentalHouse{
    @Override
    public void rent() {
        System.out.println("我是房东,我要出租50平房子");
    }
}
