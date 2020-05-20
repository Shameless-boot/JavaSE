package com.sean.mashibin.thread;

/**
 * @author: Shaun
 * @create: 2020-05-19 21:58
 * @description: TODO
 */
public class ThreadDemo extends Thread {

    @Override
    public void run() {
        // 编写线程体代码逻辑
        System.out.println("Thread is Running");
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();
        System.out.println("Main Thread is Running");
    }
}
