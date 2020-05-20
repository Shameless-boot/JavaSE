package com.sean.onjava8.streams;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author: Shaun
 * @create: 2020-05-10 14:50
 * @description: TODO
 */
public class ImperativeRandoms {
    public static void main(String[] args) {
        Random rand = new Random(47);
        SortedSet<Integer> set = new TreeSet<>();
        while (set.size() < 7) {
            int i = rand.nextInt(20);
            if (i < 5)
                continue;
            set.add(i);
        }
        System.out.println(set);
    }
}
