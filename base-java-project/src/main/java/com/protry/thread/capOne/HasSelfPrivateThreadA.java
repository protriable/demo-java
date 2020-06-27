
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : HasSelfPrivateThread.java, v 0.1 2020年06月07日 9:52 下午 shaobin Exp $
 */
public class HasSelfPrivateThreadA extends Thread{

    private HasSelfPrivateNum numRef;
    public HasSelfPrivateThreadA(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }


    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}