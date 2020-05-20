package com.sean.mashibin.thread.api;

import java.util.concurrent.TimeUnit;

/**
 * @author: Shaun
 * @create: 2020-05-15 22:20
 * @description: TODO
 */
public class JoinDemo2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Current Thread：" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Is alive ?" + Thread.currentThread().isAlive());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new JoinDemo2());
        t.start();
        // 被join的线程1秒后，进入Runnable状态。
        t.join(1000);
        System.out.println("Current Thread：" + Thread.currentThread().getName());
        System.out.println("Is alive ?" + t.isAlive());
    }
    /**
     * 输出：
     *      Current Thread：Thread-0
     *      Current Thread：main
     *      Is alive ?true
     *      Is alive ?true
     */
}