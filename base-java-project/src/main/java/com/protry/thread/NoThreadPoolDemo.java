package com.cloud.thread;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;

/**
 * @author bshao
 */
public class NoThreadPoolDemo {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        final List<Integer> list = Lists.newLinkedList();

        final Random random = new Random();
        for (int i=0; i<200000; i++) {
            Thread thread = new Thread(() -> list.add(random.nextInt()));

            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println(System.currentTimeMillis() - startTime);
        System.out.println(list.size());
    }
}
