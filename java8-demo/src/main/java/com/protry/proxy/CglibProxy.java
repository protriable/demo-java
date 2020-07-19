package com.protry.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLIB代理
 */
public class CglibProxy implements MethodInterceptor {

    /**
     * 获取被代理对象
     * @return 被代理对象
     */
    public Object getProxy(Class superclass) {
        Enhancer enhancer = new Enhancer();
        //设置被代理对象
        enhancer.setSuperclass(superclass);
        //设置回调方法, 当前对象
        enhancer.setCallback(this);
        //创建代理对象
        return enhancer.create();
    }


    /**
     *
     * @param o 被代理对象
     * @param method 被代理对象的方法
     * @param objects 被代理对象方法的参数
     * @param methodProxy 代理类中的方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("中介收取中介费");
        final Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("中介又收取中介费");
        return o1;
    }
}
