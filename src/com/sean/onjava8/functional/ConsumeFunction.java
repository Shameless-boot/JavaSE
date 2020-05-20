package com.sean.onjava8.functional;

import java.util.function.Function;

/**
 * @author: Shaun
 * @create: 2020-05-07 15:22
 * @description: TODO
 */

class One {

}

class Two {

}

public class ConsumeFunction {
    static Two consume(Function<One, Two> oneTwoFunction) {
        return oneTwoFunction.apply(new One());
    }

    public static void main(String[] args) {
        Two two = consume(one -> new Two());
    }
}
