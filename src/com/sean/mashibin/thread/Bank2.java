package com.sean.mashibin.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Shaun
 * @create: 2020-05-15 22:42
 * @description: TODO
 */
public class Bank2 {
    private int amount = 9000;
    private final ReentrantLock myLock = new ReentrantLock();
    private Condition condition = myLock.newCondition();

    void withdraw(int amount) {
        myLock.lock();
        try {
            System.out.println("withdrawing...");
            // 账户余额不足，等待充值
            if (this.amount < amount) {
                System.out.println("Amount is not enough, waiting...");
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("After deposit, balance is available: " + this.amount);
            this.amount -= amount;
            System.out.println("withdraw completed.");
            System.out.println("After withdraw, balance is available: " + this.amount);
        }finally {
            myLock.unlock();
        }
    }

    void deposit(int amount) {
        myLock.lock();
        try {
            System.out.println("depositing...");
            this.amount += amount;
            System.out.println("deposit completed");
            condition.signalAll();
        }finally {
            myLock.unlock();
        }
    }

    public static void main(String[] args) {
        final Bank2 bank = new Bank2();
        Thread t1 = new Thread(() -> bank.withdraw(15000));
        t1.start();

        new Thread(() -> bank.deposit(8000)).start();
    }
}
