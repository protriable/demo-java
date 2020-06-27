
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : SumThread.java, v 0.1 2020年06月01日 9:30 下午 shaobin Exp $
 */
public class SumThread extends Thread {

    private int i = 5;
    @Override
    public void run() {
        System.out.println("i =" + (i--) + " ,threadName=" + Thread.currentThread().getName()) ;
    }
}