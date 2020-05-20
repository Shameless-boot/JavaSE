package com.sean.mashibin.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: Shaun
 * @create: 2020-05-17 19:33
 * @description: TODO
 */
public class FixedThreadPoolDemo2 {
    public static void main(String[] args) {
        Runnable r1 = new Task("task1");
        Runnable r2 = new Task("task2");
        Runnable r3 = new Task("task3");
        Runnable r4 = new Task("task4");
        Runnable r5 = new Task("task5");

        // 使用Executors获去newFixedTreadPool对象
        ExecutorService service = Executors.newFixedThreadPool(3);

        // 添加任务到线程池中执行
        service.execute(r1);
        service.execute(r2);
        service.execute(r3);
        service.execute(r4);
        service.execute(r5);

        // 关闭线程池
        service.shutdown();
    }
}
