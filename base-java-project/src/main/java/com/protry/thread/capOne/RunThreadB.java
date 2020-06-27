
package com.protry.thread.capOne;

import lombok.Getter;

/**
 * @author shaobin
 * @version : RunThreadA.java, v 0.1 2020年06月07日 8:30 下午 shaobin Exp $
 */
@Getter
public class RunThreadB extends Thread {

    private int count = 0;
    @Override
    public void run() {
        while (true) {
            count++;
        }
    }
}