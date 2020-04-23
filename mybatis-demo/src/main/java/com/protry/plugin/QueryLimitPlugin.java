/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.plugin;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import java.sql.Connection;
import java.util.Properties;

/**
 * @author shaobin
 * @version : QueryLimitPlugin.java, v 0.1 2020年04月20日 9:02 下午 shaobin Exp $
 */
@Intercepts({@Signature(
        type = StatementHandler.class,
        method = "prepare",
        args = {Connection.class, Integer.class})})
public class QueryLimitPlugin implements Interceptor {

    // 默认限制查询返回条数
    private int limit;

    private String dbType;
    //限制表中间别名
    private static final String LIMIT_TABLE_NAME = "limit_Table_Name_XXX";
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        //取出被拦截对象
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        MetaObject metaStatementHandler = SystemMetaObject.forObject(statementHandler);
        //分离代理对象，从而形成多次代理，通过两个循环最原始的被代理类，MyBatis使用JDK代理
        while (metaStatementHandler.hasGetter("h")) {
            Object object = metaStatementHandler.getValue("h");
            metaStatementHandler = SystemMetaObject.forObject(object);
        }
        //分离最后一个代理对象的目标类
        while (metaStatementHandler.hasGetter("target")) {
            Object target = metaStatementHandler.getValue("target");
            metaStatementHandler = SystemMetaObject.forObject(target);
        }
        //取出即将要执行的SQL
        String sql = (String) metaStatementHandler.getValue("delegate.boundSql.sql");
        String limitSql;
        //判断参数是不是MySql数据库且SQL有没有被插件重写过
        if ("mysql".equals(this.dbType) && !sql.contains(LIMIT_TABLE_NAME)) {
            //去掉前后空格
            sql = sql.trim();
            //将参数写入SQL
            limitSql = "select * from (" + sql + ") " + LIMIT_TABLE_NAME + " limit " + limit;
            //重写要执行的SQL
            metaStatementHandler.setValue("delegate.boundSql.sql", limitSql);
        }
        return invocation.proceed();
    }


    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        String strLimit = properties.getProperty("limit", "50");
        this.limit = Integer.parseInt(strLimit);
        this.dbType = properties.getProperty("dbType", "mysql");
    }
}