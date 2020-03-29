/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/**
 * @author shaobin
 * @version : MyBatisUtil.java, v 0.1 2020年03月23日 9:47 下午 shaobin Exp $
 */
@Slf4j
public class SqlSessionFactoryUtil {
    //SqlSessionFactory对象
    private static SqlSessionFactory sqlSessionFactory = null;

    //类线程锁
    private static final Class CLASS_LOCK = SqlSessionFactoryUtil.class;
    //私有化构造器
    private SqlSessionFactoryUtil() {}

    /**
     * 构建SqlSessionFactory对象
     * @return 返回结果
     */
    private static SqlSessionFactory initSqlSessionFactory() {
        InputStream inputStream = null;
        String resource = "mybatis-config.xml";
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            log.error("xml配置文件解析错误, resource={}", resource);
        }
        synchronized (CLASS_LOCK) {
            if (null == sqlSessionFactory) {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            }
        }
        return sqlSessionFactory;
    }

    /**
     * 打开SqlSession
     * @return 返回结果
     */
    public static SqlSession openSqlSession() {
        if (null == sqlSessionFactory) {
            initSqlSessionFactory();
        }

        Objects.requireNonNull(sqlSessionFactory);

        return sqlSessionFactory.openSession();
    }


}