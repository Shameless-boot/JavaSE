package com.sean.mashibin.thread;

import com.sean.mashibin.thread.api.MyRun;

/**
 * @author: Shaun
 * @create: 2020-05-15 14:46
 * @description: TODO
 */
public class MyTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRun());
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "-----------" + i);
            if (i == 3) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
