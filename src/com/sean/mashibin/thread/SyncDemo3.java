package com.sean.mashibin.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author: Shaun
 * @create: 2020-05-19 14:54
 * @description: synchronized对象遇到异常立即释放锁,就绪其他线程立马抢占。
 *                  如果进行catch异常，则不会释放锁，程序继续执行。
 */

public class SyncDemo3 {
    private int count = 0;
    synchronized void f() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " and count = " + count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 5) {
                try {
                    int i = 1 / 0;
                    System.out.println(i);
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        SyncDemo3 demo3 = new SyncDemo3();
        new Thread(demo3::f,"t1").start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(demo3::f,"t2").start();
    }
}
