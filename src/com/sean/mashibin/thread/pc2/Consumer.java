package com.sean.mashibin.thread.pc2;

/**
 * @author: Shaun
 * @create: 2020-05-15 16:42
 * @description: 消费者
 */
public class Consumer implements Runnable{
    private Goods goods;

    public Consumer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            goods.get();
        }
    }
}
