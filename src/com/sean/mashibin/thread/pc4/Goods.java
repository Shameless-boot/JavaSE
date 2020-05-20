package com.sean.mashibin.thread.pc4;

/**
 * @author: Shaun
 * @create: 2020-05-15 17:31
 * @description: TODO
 */
public class Goods {
    private String brand;
    private String name;

    public Goods(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", name='" + name + '\'' ;
    }
}
