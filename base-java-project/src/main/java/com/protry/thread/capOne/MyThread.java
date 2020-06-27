
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : MyThread.java, v 0.1 2020年05月31日 8:37 下午 shaobin Exp $
 */
public class MyThread extends Thread {

    private int count = 5;

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count --;
            System.out.println(" current Thread Name=" + Thread.currentThread().getName()
                    + " count=" + count);
        }
    }
}