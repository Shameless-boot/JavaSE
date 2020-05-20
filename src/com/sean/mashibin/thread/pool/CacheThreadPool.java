package com.sean.mashibin.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: Shaun
 * @create: 2020-05-16 16:16
 * @description: TODO
 */
public class CacheThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 50; i++)
            executorService.execute(new Task("1"));
        executorService.shutdown();
    }
}
