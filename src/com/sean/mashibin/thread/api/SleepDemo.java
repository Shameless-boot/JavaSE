package com.sean.mashibin.thread.api;

/**
 * @author: Shaun
 * @create: 2020-05-19 23:09
 * @description: TODO
 */
public class SleepDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is Running..." + System.currentTimeMillis());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("After Sleeping " + System.currentTimeMillis());
    }

    public static void main(String[] args) {
        new Thread(new SleepDemo()).start();
    }
}
