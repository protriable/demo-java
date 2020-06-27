
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : LoginTest.java, v 0.1 2020年06月01日 9:23 下午 shaobin Exp $
 */
public class LoginTest {

    public static void main(String[] args) {
        LoginA loginA = new LoginA();
        LoginB loginB = new LoginB();
        loginA.start();
        loginB.start();
    }
}