/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.pattern.responsibility.consume;

/**
 * @author shaobin
 * @version : ConsumeMain.java, v 0.1 2020年04月11日 4:54 下午 shaobin Exp $
 */
public class ConsumeMain {

    public static void main(String[] args) {
        ConsumeHandler projectHandler = new ProjectHandler();
        ConsumeHandler deptHandler = new DeptHandler();
        ConsumeHandler generalHandler = new GeneralHandler();
        projectHandler.setNextHandler(deptHandler);
        deptHandler.setNextHandler(generalHandler);
        projectHandler.doHandler("lwx", 450);
        projectHandler.doHandler("lwx", 600);
        projectHandler.doHandler("zy", 600);
        projectHandler.doHandler("zy", 1500);
        projectHandler.doHandler("lwxzy", 1500);
    }
}