package com.sean.mashibin.thread.api;

/**
 * @author: Shaun
 * @create: 2020-05-15 14:57
 * @description: 线程暂停
 */
public class YieldTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRun());
        thread.start();
        thread.setPriority(9);
        for (int i = 0; i < 5; i++)
            // if (i == 2) {
            //     System.out.println(Thread.currentThread().getName() + "--------------" + i + "线程礼让一次");
            // }else
                System.out.println(Thread.currentThread().getName() + "--------------" + i);

    }
}
