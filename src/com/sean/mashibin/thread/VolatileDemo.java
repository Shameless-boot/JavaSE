package com.sean.mashibin.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author: Shaun
 * @create: 2020-05-19 16:25
 * @description: TODO
 */
public class VolatileDemo {
    private volatile boolean running = true;
    void f() {
        System.out.println("f start...");
        while (running) {

        }
        System.out.println("f end...");
    }

    public static void main(String[] args) {
        VolatileDemo demo = new VolatileDemo();
        new Thread(demo::f).start();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        demo.running = false;
    }
}
