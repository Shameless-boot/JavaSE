package com.sean.onjava8.streams;

import static java.util.stream.IntStream.*;
/**
 * @author: Shaun
 * @create: 2020-05-10 16:19
 * @description: TODO
 */
public class Repeat {
    public static void repeat(int n, Runnable run) {
        range(0,n).forEach(i -> run.run());
    }
}
