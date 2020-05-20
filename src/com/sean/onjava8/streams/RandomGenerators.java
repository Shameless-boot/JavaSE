package com.sean.onjava8.streams;

import java.util.Random;
import java.util.stream.Stream;

/**
 * @author: Shaun
 * @create: 2020-05-10 15:26
 * @description: TODO
 */
public class RandomGenerators {
    public static <T> void show(Stream<T> stream) {
        stream.limit(4).forEach(System.out::println);
        System.out.println("=========");
    }

    public static void main(String[] args) {
        Random random = new Random(47);
        // Random 只能生成基本类型的流（int,double,long)，使用boxed方法将其向上装箱
        show(random.ints().boxed());
        show(random.longs().boxed());
        show(random.doubles().boxed());

        // 控制上限和下限：
        show(random.ints(10,20).boxed());
        show(random.longs(50,100).boxed());
        show(random.doubles(20,30).boxed());

        // 控制流大小
        show(random.ints(2).boxed());
        show(random.longs(2).boxed());
        show(random.doubles(2).boxed());

        // 控制流大小和界限
        show(random.ints(3,3,9).boxed());
        show(random.longs(3, 12, 22).boxed());
        show(random.doubles(3,11.2,12.5).boxed());
    }
}
