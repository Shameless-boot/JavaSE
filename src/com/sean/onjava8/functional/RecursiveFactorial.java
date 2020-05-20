package com.sean.onjava8.functional;

/**
 * @author: Shaun
 * @create: 2020-05-06 15:03
 * @description: TODO
 */
public class RecursiveFactorial {
    static IntCall fact;
    public static void main(String[] args) {
        fact = n -> n == 0 ? 1 : n * fact.call(n - 1);
        for (int i = 0; i < 10; i++) {
            System.out.println(fact.call(i));
        }
    }
}
