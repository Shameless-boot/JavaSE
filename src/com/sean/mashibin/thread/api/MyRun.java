package com.sean.mashibin.thread.api;

/**
 * @author: Shaun
 * @create: 2020-05-15 14:46
 * @description: TODO
 */
public class MyRun implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-----" + i);
        }
    }
}
