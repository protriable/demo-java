
package com.protry.thread.capTwo;


/**
 * @author shaobin
 * @version : NewPrintString.java, v 0.1 2020年06月26日 9:50 下午 shaobin Exp $
 */
public class NewPrintString implements Runnable {


    volatile private boolean isContinuePrint = true;

    public void printStringMethod() {
        try {
            while (isContinuePrint) {
                System.out.println("run printStringMethod threadName=" +
                        Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        printStringMethod();
    }

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }
}