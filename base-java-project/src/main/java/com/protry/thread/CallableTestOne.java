package com.protry.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableTestOne {

    public static void main(String[] args) throws Exception{
        FutureTask futureTask = new FutureTask(new MyThread2());
        new Thread(futureTask).start();
        System.out.println("线程返回值：" + futureTask.get());
    }
}

class MyThread2 implements Callable<String> {

    @Override
    public String call() throws Exception {
        for ( int x = 0 ; x < 10 ; x ++ ) {
            System.out.println("******线程执行，x = " + x);
        }
        return "线程执行完毕！";
    }
}
