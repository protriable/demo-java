
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : LoginA.java, v 0.1 2020年06月01日 9:23 下午 shaobin Exp $
 */
public class LoginB extends Thread {

    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}