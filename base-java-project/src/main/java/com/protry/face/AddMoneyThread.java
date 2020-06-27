package com.protry.face;

/**
 * @author shaobin
 * @version : AddMoneyThread.java, v 0.1 2020年06月26日 2:54 下午 shaobin Exp $
 */
public class AddMoneyThread extends Thread {

    /**
     * 存入账户
     */
    private Account account;
    /**
     * 存入金额
     */
    private double money;

    public AddMoneyThread(Account account, double money) {
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        account.deposit(money);
    }
}