package com.sean.mashibin.thread.Atomic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: Shaun
 * @create: 2020-05-19 20:57
 * @description: TODO
 */
public class AtomicIntegerDemo {
    AtomicInteger count = new AtomicInteger(0);
    void f() {
        for (int i = 0; i < 10000; i++)
            count.incrementAndGet(); // count++
    }

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        AtomicIntegerDemo demo = new AtomicIntegerDemo();
        for (int i = 0; i < 10; i++)
            threads.add(new Thread(demo::f));
        threads.forEach(Thread::start);

        threads.forEach(o -> {
            try {
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println(demo.count.get());
    }
}
