package com.sean.onjava8.streams;

import java.util.*;

/**
 * @author: Shaun
 * @create: 2020-05-10 15:01
 * @description: TODO
 */
public class CollectionToStream {
    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(new Bubble(1), new Bubble(2), new Bubble(3));
        System.out.println(bubbles.stream()
                                    .mapToInt(b -> b.i)
                                    .sum()
        );

        Set<String> w = new HashSet<>(Arrays.asList("It's a wonderful day for pie!".split(" ")));
        w.stream()
                .map(x -> x + " ")
                .forEach(System.out::print);
        System.out.println();

        Map<String, Double> m = new HashMap<>(){
            {
                put("pi", 3.141596);
                put("e", 2.718);
                put("phi", 1.618);
            }
        };
        m.entrySet().stream()
                .map(e -> e.getKey() + ": " + e.getValue())
                .forEach(System.out::println);

    }
}
