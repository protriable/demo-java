
package com.protry.thread.capOne;

/**
 * 同步代码块
 * @author shaobin
 * @version : SynOneService.java, v 0.1 2020年06月16日 9:10 下午 shaobin Exp $
 */
public class SynOneService {

    public void serviceMethod() {
        try {
            synchronized (this) {
                System.out.println("1 begin time =" + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("1 end time =" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void serviceMethod2() {
        synchronized (this) {
            System.out.println("2 begin time =" + System.currentTimeMillis());
            System.out.println("2 end time =" + System.currentTimeMillis());
        }
    }
}