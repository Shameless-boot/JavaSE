package com.sean.mashibin.thread;

/**
 * @author: Shaun
 * @create: 2020-05-19 14:33
 * @description: 获得锁的对象可以访问其他没有加锁的资源。
 */
public class SyncDemo {
    public synchronized void m1() {
        System.out.println("m1 is Running...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m1 is end...");
    }

    public void m2() {
        System.out.println("m2 is Running...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m2 is end...");
    }

    public static void main(String[] args) {
        SyncDemo syncDemo = new SyncDemo();
        new Thread(syncDemo::m1, "A").start();
        new Thread(syncDemo::m2, "B").start();
    }
}
