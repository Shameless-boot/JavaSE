package com.sean.onjava8.streams;

import jdk.dynalink.Operation;

import java.util.Arrays;

/**
 * @author: Shaun
 * @create: 2020-05-10 16:54
 * @description: TODO
 */
public class Machine2 {
    public static void main(String[] args) {
        Arrays.stream(new Operations[]{
                () -> Operations.show("Bing"),
                () -> Operations.show("Crack"),
                () -> Operations.show("Twist"),
                () -> Operations.show("Pop")
        }).forEach(Operations::execute);

    }
}
