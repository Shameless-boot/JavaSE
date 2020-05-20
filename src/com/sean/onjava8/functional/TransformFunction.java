package com.sean.onjava8.functional;

import java.util.function.Function;

/**
 * @author: Shaun
 * @create: 2020-05-07 15:34
 * @description: TODO
 */

class I {
    @Override
    public String toString() {
        return "I";
    }
}

class O {
    @Override
    public String toString() {
        return "O";
    }
}

public class TransformFunction {
    static Function<I, O> transform(Function<I, O> in) {
        return in.andThen(o -> {
            System.out.println(o);
            return o;
        });
    }

    public static void main(String[] args) {
        Function<I, O> f2 = transform(i -> {
            System.out.println(i);
            return new O();
        });

        O o = f2.apply(new I());
    }
}
