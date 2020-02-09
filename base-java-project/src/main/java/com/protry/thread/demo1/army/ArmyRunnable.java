package com.protry.thread.demo1.army;

/**
 * 军队线程
 * 模拟双方作战行为
 */
public class ArmyRunnable implements Runnable{


    boolean keepRunning;

    @Override
    public void run() {
        while (keepRunning) {
            //发动五连击
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "进攻对方[" + i + "]");
            }
        }
        System.out.println(Thread.currentThread().getName() + "结束了战斗!");
    }
}
