
package com.protry.pattern.responsibility.logger;

/**
 * @author shaobin
 * @version : ErrorLogger.java, v 0.1 2020年04月11日 8:51 下午 shaobin Exp $
 */
public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}