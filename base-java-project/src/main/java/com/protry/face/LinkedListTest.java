/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.face;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author shaobin
 * @version : LinkedListTest.java, v 0.1 2020年06月25日 8:39 下午 shaobin Exp $
 */
public class LinkedListTest {

    public static void main(String[] args) {
        test02();
    }

    private static void test02() {
        LinkedList<Integer> list = getLinkedList();
        //通过快速随机访问遍历LinkedList
        listByNormalFor(list);
        //通过增强for循环遍历LinkedList
        listByStrengThenFor(list);
        //通过快迭代器遍历LinkedList
        listByIterator(list);
    }

    private static void test01() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("001");
        linkedList.add("002");
        linkedList.add("003");
        System.out.println(linkedList);

        List<String> tempList = new ArrayList<>();
        tempList.add("牛魔王");
        tempList.add("蛟魔王");
        tempList.add("鹏魔王");
        tempList.add("狮驼王");
        tempList.add("猕猴王");
        tempList.add("禺贼王");
        tempList.add("美猴王");
        tempList.add(2,"啦啦啦");
        LinkedList<String> stringList2 = new LinkedList<>(tempList);
        System.out.println(stringList2);
        System.out.println(stringList2.getFirst());
        System.out.println(stringList2.getLast());
    }

    /**
     * 构建一个LinkedList集合,包含元素50000个
     * @return
     */
    private static LinkedList<Integer> getLinkedList() {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 50000; i++){
            list.add(i);
        }
        return list;
    }

    /**
     * 通过快速随机访问遍历LinkedList
     */
    private static void listByNormalFor(LinkedList<Integer> list) {
        // 记录开始时间
        long start = System.currentTimeMillis();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i);
        }
        // 记录用时
        long interval = System.currentTimeMillis() - start;
        System.out.println("listByNormalFor：" + interval + " ms");
    }

    /**
     * 通过增强for循环遍历LinkedList
     * @param list
     */
    public static void listByStrengThenFor(LinkedList<Integer> list){
        // 记录开始时间
        long start = System.currentTimeMillis();
        for (Integer i : list) { }
        // 记录用时
        long interval = System.currentTimeMillis() - start;
        System.out.println("listByStrengThenFor：" + interval + " ms");
    }

    /**
     * 通过快迭代器遍历LinkedList
     */
    private static void listByIterator(LinkedList<Integer> list) {
        // 记录开始时间
        long start = System.currentTimeMillis();
        for(Iterator iter = list.iterator(); iter.hasNext();) {
            iter.next();
        }
        // 记录用时
        long interval = System.currentTimeMillis() - start;
        System.out.println("listByIterator：" + interval + " ms");
    }
}