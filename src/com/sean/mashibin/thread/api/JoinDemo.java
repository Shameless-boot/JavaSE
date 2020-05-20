package com.sean.mashibin.thread.api;

/**
 * @author: Shaun
 * @create: 2020-05-15 22:20
 * @description: TODO
 */
public class JoinDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Current Thread：" + Thread.currentThread().getName());
        System.out.println("Is alive ?" + Thread.currentThread().isAlive());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new JoinDemo());
        t.start();
        t.join(1000);
        System.out.println("join 1秒之后：");
        System.out.println("Current Thread：" + Thread.currentThread().getName());

        System.out.println("Is alive ?" + t.isAlive());


    }
}
