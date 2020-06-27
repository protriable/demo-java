
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : SynBlockStringService.java, v 0.1 2020年06月17日 10:00 下午 shaobin Exp $
 */
public class SynBlockStringService {

    private String usernameParam;
    private String passwordParam;
    private String anyString = new String();

    public void SetUsernamePassword(String username, String password) {
        try {
            synchronized (anyString) {
                System.out.println("线程名称：" + Thread.currentThread().getName() +
                        " 在 " + System.currentTimeMillis() + "进入同步块");
                this.usernameParam = username;
                Thread.sleep(3000);
                this.passwordParam = password;
                System.out.println("线程名称：" + Thread.currentThread().getName() +
                        " 在 " + System.currentTimeMillis() + "离开同步块");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void a() {
        try {
            synchronized (anyString) {
                System.out.println("a begin");
                Thread.sleep(3000);
                System.out.println("a end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public void b() {
        System.out.println("b begin");
        System.out.println("b end");
    }
}