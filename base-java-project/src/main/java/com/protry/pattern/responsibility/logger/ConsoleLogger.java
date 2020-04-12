/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.pattern.responsibility.logger;

/**
 * @author shaobin
 * @version : ConsoleLogger.java, v 0.1 2020年04月11日 8:50 下午 shaobin Exp $
 */
public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}