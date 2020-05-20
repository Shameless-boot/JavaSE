package com.sean.mashibin.thread;

import com.sean.mashibin.thread.api.ThreadA;
import com.sean.mashibin.thread.api.ThreadB;

/**
 * @author: Shaun
 * @create: 2020-05-15 15:06
 * @description: TODO
 */
public class Demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadA());
        Thread t2 = new Thread(new ThreadB());
        t1.start();

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
