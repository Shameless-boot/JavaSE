package com.sean.mashibin.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: Shaun
 * @create: 2020-05-16 16:35
 * @description: TODO
 */
public class SingleThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 20; i++)
            executorService.execute(new Task("1"));
        executorService.shutdown();
    }
}
