package com.sean.onjava8.functional;

import java.util.function.Function;

/**
 * @author: Shaun
 * @create: 2020-05-07 15:16
 * @description: TODO
 */

interface FuncSS extends Function<String, String> {
}

public class ProduceFunction {
    static FuncSS produce() {
        return String::toLowerCase;
    }
    public static void main(String[] args) {
        FuncSS f = produce();
        System.out.println(f.apply("HHHHHHH"));
    }
}
