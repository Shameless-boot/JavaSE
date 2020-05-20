package com.sean.onjava8.streams;

import java.util.stream.Stream;

/**
 * @author: Shaun
 * @create: 2020-05-10 16:35
 * @description: TODO
 */
public class Bubbles {
    public static void main(String[] args) {
        Stream.generate(Bubble::bubbler)
                .limit(5)
                .forEach(System.out::println);
    }
}
