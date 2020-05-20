package com.sean.mashibin.thread;

/**
 * @author: Shaun
 * @create: 2020-05-15 22:42
 * @description: TODO
 */
public class Bank {
    private int amount = 9000;

    synchronized void withdraw(int amount) {
        System.out.println("withdrawing...");
        // 账户余额不足，等待充值
        if (this.amount < amount) {
            System.out.println("Amount is not enough, waiting...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("After deposit, balance is available: " + this.amount);
        this.amount -= amount;
        System.out.println("withdraw completed.");
        System.out.println("After withdraw, balance is available: " + this.amount);
    }

    synchronized void deposit(int amount) {
        System.out.println("depositing...");
        this.amount += amount;
        System.out.println("deposit completed");
        notify();
    }

    public static void main(String[] args) {
        final Bank bank = new Bank();
        Thread t1 = new Thread(() -> bank.withdraw(15000));
        t1.start();

        new Thread(() -> bank.deposit(8000)).start();
    }
}
