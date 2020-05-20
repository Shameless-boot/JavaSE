package com.sean.mashibin.thread.api;

/**
 * @author: Shaun
 * @create: 2020-05-14 17:19
 * @description: Thread中的一些操作
 */
public class ThreadApi implements Runnable{

    public static void main(String[] args) {
        // 获取当前线程
        Thread thread = Thread.currentThread();
        // 获取线程名字
        System.out.println(thread.getName());
        // 获取线程优先级
        System.out.println(thread.getPriority());
        // 设置线程优先级
        //thread.setPriority(10);
        System.out.println("更改后的优先级：" + thread.getPriority());
        // 判断线程是否存活
        // 线程已经调用了start()方法，而且还没有死亡。
        System.out.println(thread.isAlive());

        Thread t1 = new Thread(new ThreadApi());
        t1.setPriority(10);
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());

        for (int i = 0; i < 5; i++)
            System.out.println(thread.getName() + "-------------" + i);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println(Thread.currentThread().getName() + "---------------" + i);
    }
}
