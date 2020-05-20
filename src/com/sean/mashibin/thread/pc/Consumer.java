package com.sean.mashibin.thread.pc;

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
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "取走了" + goods.getBrand() + "----" + goods.getName());
        }
    }
}
