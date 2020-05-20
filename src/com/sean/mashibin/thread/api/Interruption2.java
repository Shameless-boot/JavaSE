package com.sean.mashibin.thread.api;

/**
 * @author: Shaun
 * @create: 2020-05-18 14:44
 * @description: TODO
 */
public class Interruption2 implements Runnable{
    private volatile static boolean flag = false;
    @Override
    public void run() {
        if (flag)
            System.out.println("a");
        while (!flag) {
            System.out.println("Thread Running...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted...");
            }
        }
        System.out.println("Thread exiting under request...");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Interruption2());
        thread.start();
        System.out.println("Starting a thread...");

        Thread.sleep(3000);

        System.out.println("Asking thread to stop");
        Interruption2.flag = true;
        thread.interrupt();

        Thread.sleep(3000);
        System.out.println("Stopping Application...");
        System.exit(0);
    }
}
