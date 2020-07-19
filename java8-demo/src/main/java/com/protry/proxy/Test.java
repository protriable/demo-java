package com.protry.proxy;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        jdkProxy();
    }

    private static void cglibProxy() {
        final CglibProxy cglibProxy = new CglibProxy();
        final Host proxy = (Host) cglibProxy.getProxy(Host.class);
        proxy.rent();
    }

    private static void jdkProxy2() {
        final RentalHouse host = new Host();
        RentalHouse hostProxy = (RentalHouse) Proxy.newProxyInstance(host.getClass().getClassLoader(), host.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("我是中介，收你500推荐费");
                    Object invoke = method.invoke(host, args);
                    System.out.println("我是中介，我又想收你1000块钱！");
                    return invoke;
                });
        hostProxy.rent();
    }

    private static void jdkProxy() {
        final RentalHouse host = new Host();
        final JdkProxy jdkProxy = new JdkProxy(host);
        final RentalHouse proxy = (RentalHouse) jdkProxy.getProxy();
        proxy.rent();
    }

    private static void staticProxy() {
        RentalHouse host = new Host();
        StaticProxy proxy = new StaticProxy(host);
        proxy.rent();
    }
}
