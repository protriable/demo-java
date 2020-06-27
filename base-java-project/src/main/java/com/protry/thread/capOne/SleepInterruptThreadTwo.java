
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : SleepInterruptThreadTwo.java, v 0.1 2020年06月03日 9:15 下午 shaobin Exp $
 */
public class SleepInterruptThreadTwo extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            System.out.println("i=" + (i+1));
        }
        try {
            System.out.println("run begin");
            Thread.sleep(1000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("先停止，再遇到sleep，进入catch!");
            e.printStackTrace();
        }
    }
}