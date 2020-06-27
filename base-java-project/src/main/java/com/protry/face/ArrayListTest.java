package com.protry.face;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shaobin
 * @version : ArrayListTest.java, v 0.1 2020年06月25日 3:40 下午 shaobin Exp $
 */
public class ArrayListTest {

    public static void main(String[] args) {
        test02();
    }

    private static void test02() {
        List<String> list = new ArrayList<>();
        list.add("01");
        list.add("02");
        list.add("03");
        list.remove(1);
    }

    private static void test01() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("000");
        arrayList.add("111");
    }
}