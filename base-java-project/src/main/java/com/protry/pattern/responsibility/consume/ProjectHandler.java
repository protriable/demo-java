/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.pattern.responsibility.consume;

/**
 * 项目经理
 * @author shaobin
 * @version : ProjectHandler.java, v 0.1 2020年04月10日 9:59 下午 shaobin Exp $
 */
public class ProjectHandler extends ConsumeHandler{
    @Override
    public void doHandler(String user, double free) {
        if (free < 500) {
            if ("lwx".equals(user)) {
                System.out.println("给与报销: " + free);
            } else {
                System.out.println("报销不通过");
            }
        } else {
            if (getNextHandler()!= null) {
                getNextHandler().doHandler(user, free);
            }
        }
    }
}