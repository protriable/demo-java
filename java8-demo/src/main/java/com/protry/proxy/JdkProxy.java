package com.protry.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 */
public class JdkProxy implements InvocationHandler {

    private RentalHouse rentalHouse;

    public JdkProxy(RentalHouse rentalHouse) {
        this.rentalHouse = rentalHouse;
    }

    public Object getProxy() {
        // 设置该变量可以保存动态代理类，默认名称$Proxy0.class
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        return Proxy.newProxyInstance(rentalHouse.getClass().getClassLoader(),
                rentalHouse.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是中介，收你500推荐费");
        Object invoke = method.invoke(rentalHouse, args);
        System.out.println("我是中介，我又想收你1000块钱！");
        System.out.println(method.getReturnType().getName());
        return invoke;
    }
}
