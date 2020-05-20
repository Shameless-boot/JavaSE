package com.sean.mashibin.thread.pool;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Shaun
 * @create: 2020-05-16 16:16
 * @description: TODO
 */
public class Task implements Runnable{
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
            if (i == 0)
                System.out.println("Initialization Time for task name - "
                        + name + " = " + sdf.format(date));
            else
                System.out.println("Executing Time for task name - "
                        + name + " = " + sdf.format(date));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + "complete");
    }
}
