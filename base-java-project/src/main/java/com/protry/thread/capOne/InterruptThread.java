
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : InterruptThread.java, v 0.1 2020年06月02日 9:15 下午 shaobin Exp $
 */
public class InterruptThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i=" + (i+1));
        }
    }

}