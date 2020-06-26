/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.face;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author shaobin
 * @version : CopyOnWriteArrayListTest.java, v 0.1 2020年06月26日 1:10 下午 shaobin Exp $
 */
public class CopyOnWriteArrayListTest {

    public static void main(String[] args) {
        CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>();
        arrayList.add("111");
        arrayList.add("222");
    }
}