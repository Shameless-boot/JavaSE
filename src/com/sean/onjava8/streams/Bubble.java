package com.sean.onjava8.streams;

/**
 * @author: Shaun
 * @create: 2020-05-10 14:55
 * @description: TODO
 */
public class Bubble {
    public final int i;

    public Bubble(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Bubble("+i+")";
    }

    private static int count = 0;

    public static Bubble bubbler() {
        return new Bubble(count++);
    }
}
