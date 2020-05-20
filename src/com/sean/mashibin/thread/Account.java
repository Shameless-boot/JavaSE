package com.sean.mashibin.thread;

/**
 * @author: Shaun
 * @create: 2020-05-15 16:04
 * @description: TODO
 */
public class Account implements Runnable{
    private int balance = 1500;

    public synchronized void deposit(int amount) {
        balance += amount;
    }

    public synchronized void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("余额不足以支付" + Thread.currentThread().getName() +
                    "的取款，" + "余额为：" + balance);
        } else {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + "，准备取款");
            System.out.println(Thread.currentThread().getName() + "，完成取款。" + "余额为：" + balance);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdraw(500);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Account account = new Account();
        Thread t1 = new Thread(account, "张三");
        Thread t2 = new Thread(account, "张三的妻子");
        t1.start();
        t2.start();

    }
}
