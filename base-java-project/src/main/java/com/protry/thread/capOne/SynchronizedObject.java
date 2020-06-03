/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : SynchronizedObject.java, v 0.1 2020年06月03日 9:43 下午 shaobin Exp $
 */
public class SynchronizedObject {

    private String username = "a";
    private String password = "aa";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    synchronized public void printString(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(10000);
            this.password = password;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}