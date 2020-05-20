package com.sean.mashibin.thread.pc4;

import com.sean.mashibin.thread.pc3.Producer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author: Shaun
 * @create: 2020-05-15 17:29
 * @description: TODO
 */
public class Test {
    public static void main(String[] args) {
        BlockingQueue<Goods> queue = new ArrayBlockingQueue<>(5);
        ProducerQueue producerQueue = new ProducerQueue(queue);
        ConsumerQueue consumerQueue = new ConsumerQueue(queue);
        new Thread(producerQueue).start();
        new Thread(consumerQueue).start();
    }
}
