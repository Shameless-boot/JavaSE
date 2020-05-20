package com.sean.mashibin.thread.pc3;

/**
 * @author: Shaun
 * @create: 2020-05-15 16:42
 * @description: TODO
 */
public class Goods {
    private String brand;
    private String name;

    // 默认false为无商品，true为生产了商品了。
    private boolean flag;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public synchronized void get() {
        // 如果无商品，该线程进行等待，直到生产者生产了商品
        if (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "取走了" + this.getBrand() + "----" + this.getName());
        flag = false;
        notify();
    }

    public synchronized void set(String brand, String name) {
        // 如果有商品了，让该商品进行等待，直到消费者进行了消费。
        if (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setBrand(brand);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println(Thread.currentThread().getName() + "生产了" + this.getBrand() + "----" + this.getName());
        flag = true;
        notify();
    }
}
