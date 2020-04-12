/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.pattern.responsibility.consume;

/**
 * @author shaobin
 * @version : DeptHandler.java, v 0.1 2020年04月10日 10:09 下午 shaobin Exp $
 */
public class DeptHandler extends ConsumeHandler {
    @Override
    public void doHandler(String user, double free) {
        if (free < 1000) {

            if (user.equals("zy")) {
                System.out.println("给予报销:" + free);
            } else {
                System.out.println("报销不通过");
            }

        } else {
            if (getNextHandler() != null) {

                getNextHandler().doHandler(user, free);
            }
        }
    }
}