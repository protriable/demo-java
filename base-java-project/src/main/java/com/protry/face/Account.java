package com.protry.face;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author shaobin
 * @version : Account.java, v 0.1 2020年06月26日 2:53 下午 shaobin Exp $
 */
public class Account {

    private final Lock accountLock = new ReentrantLock();
    /**
     * 账户余额
     */
    private double balance;

    /** 存款
     * @param money 存入金额
     */
    public void deposit(double money) {
        accountLock.lock();
        try {
            double newBalance = balance + money;
            try {
                Thread.sleep(10);   // 模拟此业务需要一段处理时间
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            balance = newBalance;
        }finally {
            accountLock.unlock();
        }
    }

    /**
     * 获得账户余额
     */
    public double getBalance() {
        return balance;
    }
}