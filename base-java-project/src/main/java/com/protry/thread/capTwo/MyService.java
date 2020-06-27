
package com.protry.thread.capTwo;

/**
 * @author shaobin
 * @version : MyService.java, v 0.1 2020年06月26日 9:23 下午 shaobin Exp $
 */
public class MyService {
    private String lock = "123";
    public void testMethod() {
        try {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() +
                        " begin " + System.currentTimeMillis());
                lock = "456";
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() +
                        " end " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}