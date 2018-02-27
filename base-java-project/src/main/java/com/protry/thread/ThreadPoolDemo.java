package com.protry.thread;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author bshao
 */
public class ThreadPoolDemo {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        final List<Integer> list = Lists.newLinkedList();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                1, 1, 60, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(200000));
        final Random random = new Random();
        for (int i=0; i<200000; i++) {
            executor.execute(() -> list.add(random.nextInt()));
        }
        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - startTime);
        System.out.println(list.size());
    }
}
