/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.factory;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

import java.util.List;
import java.util.Properties;

/**
 * @author shaobin
 * @version : MyObjectFactory.java, v 0.1 2020年03月29日 9:07 下午 shaobin Exp $
 */
@Slf4j
public class MyObjectFactory extends DefaultObjectFactory {

    private static final long serialVersionUID = -3207343078052034923L;

    @Override
    public void setProperties(Properties properties) {
        log.info("定制属性： " + properties);
        super.setProperties(properties);
    }

    @Override
    public <T> T create(Class<T> type) {
        log.info("111");
        return super.create(type);
    }

    @Override
    public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
        return super.create(type, constructorArgTypes, constructorArgs);
    }

    @Override
    public <T> boolean isCollection(Class<T> type) {
        return super.isCollection(type);
    }
}