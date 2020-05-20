package com.sean.mashibin.thread.api;

/**
 * @author: Shaun
 * @create: 2020-05-15 21:37
 * @description: TODO
 */
public class YieldDemo{

    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread t1 = new Thread(myRun,"A");
        Thread t2 = new Thread(myRun,"B");
        Thread t3 = new Thread(myRun,"C");
        t1.start();
        t2.start();
        t3.start();
    }
}
