package com.protry.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTestOne {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        for (String data: Arrays.asList("A","B","D","E","F","C")) {
            hashSet.add(data);
            linkedHashSet.add(data);
            treeSet.add(data);
        }

        System.out.println("HashSet : " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet : " + treeSet);
    }
}
