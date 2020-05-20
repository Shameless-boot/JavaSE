package com.sean.mashibin.thread;

/**
 * @author: Shaun
 * @create: 2020-05-19 22:19
 * @description: TODO
 */
public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("Thread is Running");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableDemo());
        thread.start();
        System.out.println("Main Thread is Running");
    }
}
