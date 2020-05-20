package com.sean.mashibin.thread.api;

/**
 * @author: Shaun
 * @create: 2020-05-15 14:52
 * @description: TODO
 */
public class MySleep {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRun());
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "---------------" + i);

            if (i == 2) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
