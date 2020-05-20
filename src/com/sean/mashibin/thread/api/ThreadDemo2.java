package com.sean.mashibin.thread.api;

/**
 * @author: Shaun
 * @create: 2020-05-14 16:00
 * @description: 实现Runnable创建线程
 */

/**
 *      第二种创建线程的方式：
 *          1. 创建一个实现了Runnable接口的类。
 *          2. 实现run方法，编写核心线程体。
 *          3. 创建一个Thread对象，将实现了Runnable的类做为参数传递给Thread构造函数。
 *          4. 调用Thread对象的start()方法，启动线程。
 */
public class ThreadDemo2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println(Thread.currentThread().getName() + "----------------" + i);
    }

    public static void main(String[] args) {
        ThreadDemo2 threadDemo2 = new ThreadDemo2();
        Thread thread = new Thread(threadDemo2);
        thread.start();
        for (int i = 0; i < 10; i++)
            System.out.println(Thread.currentThread().getName() + "----------------" + i);
    }
}
