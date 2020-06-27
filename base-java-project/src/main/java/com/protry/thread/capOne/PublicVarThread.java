
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : PublicVarThread.java, v 0.1 2020年06月09日 9:03 下午 shaobin Exp $
 */
public class PublicVarThread extends Thread{
    private PublicVar publicVar;

    public PublicVarThread(PublicVar publicVar) {
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        publicVar.setValue("B","BB");
    }
}