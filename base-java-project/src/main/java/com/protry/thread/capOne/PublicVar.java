
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : PublicVar.java, v 0.1 2020年06月08日 10:43 下午 shaobin Exp $
 */
public class PublicVar {

    public String username = "A";
    public String password = "AA";

    synchronized public void setValue(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue method thread name= " + Thread.currentThread().getName()
            + " username = " + username + " password = " + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getValue() {
        System.out.println("getValue method thread name= " + Thread.currentThread().getName()
                + " username = " + this.username + " password = " + this.password);
    }
}