package com.sean.mashibin.thread;

/**
 * @author: Shaun
 * @create: 2020-05-19 14:48
 * @description: synchronized是可重入的，可以不断的获得其他锁对象。
 */
class Parent {
    public synchronized void f() {
        System.out.println("Parent f start...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Parent f end...");
    }
}

class Child extends Parent {
    @Override
    public synchronized void f() {
        System.out.println("Child f start...");
        super.f();
        System.out.println("Child f end...");
    }
}
public class SyncDemo2 {
    public static void main(String[] args) {
        Child child = new Child();
        new Thread(child::f).start();
    }
}
