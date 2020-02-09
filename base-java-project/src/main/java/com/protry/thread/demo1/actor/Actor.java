package com.protry.thread.demo1.actor;

public class Actor extends Thread {

    @Override
    public void run() {
        System.out.println(getName() + "是一个演员！");
        int count = 0;
        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println(getName() + "登台演出了" + (++count) + "次");
            if (count == 100) {
                keepRunning = false;
            }
        }

        System.out.println(getName() + "的演出结束了！");
    }

    public static void main(String[] args) {
        Actor actor = new Actor();
        actor.setName("Mr.Thread");
        actor.start();

        Thread actressThread = new Thread(new Actress(), "Mr.Runnable");
        actressThread.start();
    }
}

class Actress implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "是一个演员！");
        int count = 0;
        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println(Thread.currentThread().getName() + "登台演出了" + (++count) + "次");
            if (count == 100) {
                keepRunning = false;
            }
        }

        System.out.println(Thread.currentThread().getName() + "的演出结束了！");
    }
}