/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : SynTask.java, v 0.1 2020年06月09日 10:02 下午 shaobin Exp $
 */
public class SynImproveTask {

    private String getData1;
    private String getData2;

    public void doLongTimeTask() {
        try {
            System.out.println("begin SynImproveTask");
            Thread.sleep(3000);
            String privateGetData1 = "长时间任务后远程返回值1 threadName=" + Thread.currentThread().getName();
            String privateGetData2 = "长时间任务后远程返回值2 threadName=" + Thread.currentThread().getName();
            synchronized (this) {
                getData1 = privateGetData1;
                getData2 = privateGetData2;
            }
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end SynImproveTask");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}