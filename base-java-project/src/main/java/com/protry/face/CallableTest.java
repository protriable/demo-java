package com.protry.face;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author shaobin
 * @version : CallableTest.java, v 0.1 2020年06月26日 3:20 下午 shaobin Exp $
 */
public class CallableTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Future<Integer>> arrayList = new ArrayList<>();
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            CallableTask callableTask = new CallableTask((int) (Math.random() * 100));
            arrayList.add(service.submit(callableTask));
        }
        int sum = 0;
        for (Future<Integer> future : arrayList) {
            sum += future.get();
        }
        System.out.println(sum);

    }
}