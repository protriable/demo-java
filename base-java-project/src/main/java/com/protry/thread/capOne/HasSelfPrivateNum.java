
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : HasSelfPrivateNum.java, v 0.1 2020年06月07日 9:44 下午 shaobin Exp $
 */
public class HasSelfPrivateNum {

    private int num = 0;

    public void addI(String username) {
        try {
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println("username =" + this.num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}