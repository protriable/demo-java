
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : InterruptThreadTwo.java, v 0.1 2020年06月02日 9:33 下午 shaobin Exp $
 */
public class InterruptThreadTwo extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (InterruptThreadTwo.interrupted()) {
                System.out.println("我要退出，线程停止了");
                break;
            }
            System.out.println("i=" + (i+1));
        }
    }
}