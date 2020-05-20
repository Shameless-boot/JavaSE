package com.sean.mashibin.thread.pc4;

import java.util.concurrent.BlockingQueue;

/**
 * @author: Shaun
 * @create: 2020-05-15 17:26
 * @description: TODO
 */
public class ConsumerQueue implements Runnable{
    private BlockingQueue<Goods> blockingQueue;

    public ConsumerQueue(BlockingQueue<Goods> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("消费者消费了 " + blockingQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
