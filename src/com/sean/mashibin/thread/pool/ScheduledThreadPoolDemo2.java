package com.sean.mashibin.thread.pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author: Shaun
 * @create: 2020-05-16 16:41
 * @description: TODO
 */
public class ScheduledThreadPoolDemo2 {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(3);
        long begin = System.currentTimeMillis();
        service.scheduleAtFixedRate(
                () -> {
                    long end = System.currentTimeMillis();
                    System.out.println("1----延迟一秒执行，每三秒执行一次。");
                    System.out.println("过去了" + (end - begin) / 1000 +"秒");
                },
                1,3,TimeUnit.SECONDS
        );
        service.scheduleAtFixedRate(
                () -> {
                    long end = System.currentTimeMillis();
                    System.out.println("2----延迟一秒执行，每三秒执行一次。");
                    System.out.println("过去了" + (end - begin) / 1000 +"秒");
                },
                1,3,TimeUnit.SECONDS
        );
        service.scheduleAtFixedRate(
                () -> {
                    long end = System.currentTimeMillis();
                    System.out.println("3----延迟一秒执行，每三秒执行一次。");
                    System.out.println("过去了" + (end - begin) / 1000 +"秒");
                },
                1,3,TimeUnit.SECONDS
        );
        service.scheduleAtFixedRate(
                () -> {
                    long end = System.currentTimeMillis();
                    System.out.println("4----延迟一秒执行，每三秒执行一次。");
                    System.out.println("过去了" + (end - begin) / 1000 +"秒");
                },
                1,3,TimeUnit.SECONDS
        );
        // service.shutdown();

    }
}
