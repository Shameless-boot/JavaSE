package com.sean.mashibin.thread.api;

/**
 * @author: Shaun
 * @create: 2020-05-18 16:26
 * @description: TODO
 */
public class DaemonDemo {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(new God());
        daemonThread.setDaemon(true);
        daemonThread.start();
        new Thread(new You()).start();
    }
}

class God implements Runnable {
    @Override
    public void run() {
        while (true)
            System.out.println("God bless you...");
    }
}

class You implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 365000; i++)
            System.out.println("Hello,World...");
        System.out.println("Goodbye World...");
    }
}
