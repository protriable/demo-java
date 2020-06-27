
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : SynTask.java, v 0.1 2020年06月09日 10:02 下午 shaobin Exp $
 */
public class SynTask {

    private String getData1;
    private String getData2;

    public synchronized void doLongTimeTask() {
        try {
            System.out.println("begin task");
            Thread.sleep(3000);
            getData1 = "长时间任务后远程返回值1 threadName=" + Thread.currentThread().getName();
            getData2 = "长时间任务后远程返回值2 threadName=" + Thread.currentThread().getName();
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}