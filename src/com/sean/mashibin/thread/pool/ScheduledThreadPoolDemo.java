package com.sean.mashibin.thread.pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author: Shaun
 * @create: 2020-05-16 16:41
 * @description: TODO
 */
public class ScheduledThreadPoolDemo {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(3);
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 1; i++) {
            service.schedule(
                    () ->
                    {
                        long end = System.currentTimeMillis();
                        System.out.println("延时三秒执行");
                        System.out.println(end - begin);
                    },
                    3, TimeUnit.SECONDS);

        }


        service.shutdown();

    }
}
