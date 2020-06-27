package com.protry.face;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shaobin
 * @version : HashMapTest.java, v 0.1 2020年06月26日 2:39 下午 shaobin Exp $
 */
public class HashMapTest {


    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("1","11");
        hashMap.put("2","22");
        System.out.println(hashMap);
    }
}