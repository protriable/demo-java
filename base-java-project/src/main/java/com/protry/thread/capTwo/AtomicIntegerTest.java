package com.protry.thread.capTwo;

public class AtomicIntegerTest {

    public static void main(String[] args) {
        final AddCountThread addCountThread = new AddCountThread();
        new Thread(addCountThread).start();
        new Thread(addCountThread).start();
        new Thread(addCountThread).start();
        new Thread(addCountThread).start();
        new Thread(addCountThread).start();
    }
}
