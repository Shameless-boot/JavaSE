package com.sean.mashibin.thread.api;

/**
 * @author: Shaun
 * @create: 2020-05-18 14:44
 * @description: TODO
 */
public class Interruption implements Runnable{
    @Override
    public void run() {
        while (true) {
            if (Thread.currentThread().isInterrupted())
                System.out.println("Yes,I'm interrupted. But I'm still working on it.");
            else
                System.out.println("Not yet.");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Interruption());
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
