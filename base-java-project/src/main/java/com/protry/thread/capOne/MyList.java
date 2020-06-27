
package com.protry.thread.capOne;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shaobin
 * @version : MyList.java, v 0.1 2020年06月22日 8:10 下午 shaobin Exp $
 */
public class MyList {

    private List<String> list = new ArrayList<>();

    synchronized public void add(String name) {
        System.out.println("threadName=" + Thread.currentThread().getName()
            + "执行了add方法");
        list.add(name);
        System.out.println("threadName=" + Thread.currentThread().getName()
            + "退出了add方法");
    }

    synchronized public int getSize() {
        System.out.println("threadName=" + Thread.currentThread().getName()
                + "执行了getSize方法");
        int size = list.size();
        System.out.println("threadName=" + Thread.currentThread().getName()
                + "退出了getSize方法");
        return size;
    }
}