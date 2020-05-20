package com.sean.mashibin.thread.pc4;

import java.util.concurrent.BlockingQueue;

/**
 * @author: Shaun
 * @create: 2020-05-15 17:26
 * @description: TODO
 */
public class ProducerQueue implements Runnable{
    private BlockingQueue<Goods> blockingQueue;

    public ProducerQueue(BlockingQueue<Goods> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Goods goods;
            if (i % 2 == 0) {
                goods = new Goods("哇哈哈", "矿泉水");
            }else
                goods = new Goods("旺仔", "小馒头");
            System.out.println("生产者开始生产 " + goods);
            try {
                blockingQueue.put(goods);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
