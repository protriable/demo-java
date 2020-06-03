/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : LoginServlet.java, v 0.1 2020年06月01日 9:20 下午 shaobin Exp $
 */
public class LoginServlet {

    private static String usernameRef;
    private static String passwordRef;

    public static void doPost(String username, String password) {
        try {
            usernameRef = username;
            if (username.equals("a")) {
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("usernameRef=" + usernameRef + " passwordRef=" + passwordRef);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}