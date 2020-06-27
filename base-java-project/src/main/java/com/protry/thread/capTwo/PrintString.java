
package com.protry.thread.capTwo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author shaobin
 * @version : PrintString.java, v 0.1 2020年06月26日 9:46 下午 shaobin Exp $
 */
public class PrintString {

    @Setter @Getter
    private boolean isContinuePrint = true;

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

}