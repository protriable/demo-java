
package com.protry.thread.capTwo;

/**
 * @author shaobin
 * @version : DealThread.java, v 0.1 2020年06月22日 9:01 下午 shaobin Exp $
 */
public class DealThread implements Runnable {


    private String username;
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void setFlag(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        if (username.equals("a")) {
            synchronized (lock1) {
                try {
                    System.out.println("username = " + username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("按lock1 -> lock2 代码执行了顺序");
                }
            }
        }

        if (username.equals("b")) {
            synchronized (lock2) {
                try {
                    System.out.println("username = " + username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("按lock2 -> lock1 代码执行了顺序");
                }
            }
        }
    }
}