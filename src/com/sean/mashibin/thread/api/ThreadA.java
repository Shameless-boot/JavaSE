package com.sean.mashibin.thread.api;

/**
 * @author: Shaun
 * @create: 2020-05-15 15:06
 * @description: TODO
 */
public class ThreadA implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "----A");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
