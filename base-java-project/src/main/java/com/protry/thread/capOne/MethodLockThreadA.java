
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : MethodLockThreadA.java, v 0.1 2020年06月08日 10:25 下午 shaobin Exp $
 */
public class MethodLockThreadA extends Thread{

    private MethodLockObject object;

    public MethodLockThreadA(MethodLockObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        this.object.methodA();
    }
}