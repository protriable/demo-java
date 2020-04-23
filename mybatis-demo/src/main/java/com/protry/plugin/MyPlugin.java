/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.plugin;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;

import java.util.Properties;


/**
 * @author shaobin
 * @version : MyPlugin.java, v 0.1 2020年04月18日 8:16 下午 shaobin Exp $
 */
@Intercepts({@Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})})
public class MyPlugin implements Interceptor {
    Properties props = null;

    /**
     * 代替拦截器对象的内容
     * @param invocation 责任链对象
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.err.println("before...");
        //如果当前代理是一个非代理对象，那么它就回调用真实拦截对象的方法，如果不是，它会调用下一个
        //插件代理对象的invoke方法
        Object object = invocation.proceed();
        System.err.println("after...");
        return object;
    }

    /**
     * 生成对象的代理，这里常用MyBatis提供的Plugin类的wrap方法
     * @param target 被代理的对象
     * @return
     */
    @Override
    public Object plugin(Object target) {
        System.err.println("调用生成代理对象...");
        return Plugin.wrap(target, this);
    }


    @Override
    public void setProperties(Properties properties) {
        System.err.println(properties.get("dbType"));
        this.props = properties;
    }
}