package com.sean.mashibin.thread.api;

/**
 * @author: Shaun
 * @create: 2020-05-15 15:06
 * @description: TODO
 */
public class ThreadB implements Runnable{
    @Override
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + "---- B");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
