package com.sean.mashibin.thread.pc;

/**
 * @author: Shaun
 * @create: 2020-05-15 16:42
 * @description: TODO
 */
public class Test {
    public static void main(String[] args) {
        Goods goods = new Goods();
        Producer producer = new Producer(goods);
        Consumer consumer = new Consumer(goods);

        Thread t1 = new Thread(producer,"生产者");
        Thread t2 = new Thread(consumer,"消费者");
        t1.start();
        t2.start();
    }
}
