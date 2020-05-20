package com.sean.onjava8.streams;

import java.io.InputStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author: Shaun
 * @create: 2020-05-10 16:15
 * @description: TODO
 */
public class Ranges {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 10; i < 20; i++)
            result += i;
        System.out.println(result);

        result = 0;
        for (int i : IntStream.range(10,20).toArray())
            result += i;
        System.out.println(result);

        System.out.println(IntStream.range(10,20).sum());
    }
}
