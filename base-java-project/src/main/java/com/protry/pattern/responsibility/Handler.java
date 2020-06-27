
package com.protry.pattern.responsibility;

/**
 * @author shaobin
 * @version : Handler.java, v 0.1 2020年04月09日 9:38 下午 shaobin Exp $
 */
public abstract class Handler {

    private Handler nextHandler;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void doHandler();
}