package com.sean.mashibin.thread.pc2;

/**
 * @author: Shaun
 * @create: 2020-05-15 16:42
 * @description: TODO
 */
public class Goods {
    private String brand;
    private String name;

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
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "取走了" + this.getBrand() + "----" + this.getName());
    }

    public synchronized void set(String brand, String name) {
        this.setBrand(brand);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println(Thread.currentThread().getName() + "生产了" + this.getBrand() + "----" + this.getName());
    }
}
