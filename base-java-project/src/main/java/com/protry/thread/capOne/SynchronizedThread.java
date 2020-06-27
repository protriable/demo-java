
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : SynchronizedThread.java, v 0.1 2020年06月03日 9:46 下午 shaobin Exp $
 */
public class SynchronizedThread extends Thread {

    private SynchronizedObject synchronizedObject;

    public SynchronizedThread(SynchronizedObject synchronizedObject) {
        super();
        this.synchronizedObject = synchronizedObject;
    }

    @Override
    public void run() {
        synchronizedObject.printString("b", "bb");
    }
}