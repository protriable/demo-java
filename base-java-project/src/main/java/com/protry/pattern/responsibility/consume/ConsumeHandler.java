
package com.protry.pattern.responsibility.consume;

/**
 * @author shaobin
 * @version : ConsumeHandler.java, v 0.1 2020年04月09日 9:45 下午 shaobin Exp $
 */
public abstract class ConsumeHandler {

    private ConsumeHandler nextHandler;

    public ConsumeHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(ConsumeHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     *
     * @param user 申请人
     * @param free 报销费用
     */
    public abstract void doHandler(String user, double free);
}