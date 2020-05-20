package com.sean.onjava8.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: Shaun
 * @create: 2020-05-10 15:39
 * @description: TODO
 */
public class RandomWords implements Supplier<String> {
    private List<String> words = new ArrayList<>();
    private Random random = new Random(47);

    public RandomWords(String fName) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(fName));

        for (String line : lines.subList(1,lines.size()))
        /**
         *  spilt : [] -> 被分割的表达式
         *          +  -> 表达式可以出现一次或多次
         */
            for (String word : line.split("[ .?,]+"))
                words.add(word.toLowerCase());
    }

    @Override
    public String get() {
        return words.get(random.nextInt(words.size()));
    }

    @Override
    public String toString() {
        return words.stream().collect(Collectors.joining(" "));
    }

    public static void main(String[] args) throws IOException {
        System.out.println(
                Stream.generate(new RandomWords("./src/com/sean/onjava8/streams/Cheese.dat"))
                        .limit(10)
                        .collect(Collectors.joining(" "))
        );
    }
}
