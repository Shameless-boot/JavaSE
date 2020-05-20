package com.sean.onjava8.streams;

/**
 * @author: Shaun
 * @create: 2020-05-10 16:22
 * @description: TODO
 */
public class Looping {
    static void hi() {
        System.out.println("Hi!");
    }

    public static void main(String[] args) {
        Repeat.repeat(3,() -> System.out.println("Looping!!!"));
        Repeat.repeat(2,Looping::hi);
    }
}
