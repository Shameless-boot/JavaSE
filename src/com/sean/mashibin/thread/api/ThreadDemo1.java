package com.sean.mashibin.thread.api;

/**
 * @author: Shaun
 * @create: 2020-05-14 15:24
 * @description: 创建线程
 */

/**
 *      创建线程：
 *          1. 继承与Thread类。
 *          2. 覆写其中的run方法，编写核心的线程体。
 *          3. 调用start()方法，启动线程。ps：不能直接调用run方法。
 */
public class ThreadDemo1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println(Thread.currentThread().getName() + "----------------" + i);
    }

    public static void main(String[] args) {
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        threadDemo1.start();

        for (int i = 0; i < 200; i++)
            System.out.println(Thread.currentThread().getName() + "----------------" + i);
    }
}
