package com.sean.onjava8.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author: Shaun
 * @create: 2020-05-10 16:42
 * @description: TODO
 */
public class FileToWordsBuilder {
    private Stream.Builder<String> builder = Stream.builder();

    public FileToWordsBuilder(String filePath) throws IOException {
        Files.lines(Paths.get(filePath))
                .forEach(
                        line -> {
                            for (String word : line.split("[ ,?.]+"))
                                builder.add(word);
                        }
                );
    }

    Stream<String> stream() {
        return builder.build();
    }

    public static void main(String[] args) throws IOException {
        new FileToWordsBuilder("./src/com/sean/onjava8/streams/Cheese.dat").stream()
                .limit(7)
                .map(w -> w + " ")
                .forEach(System.out::print);
    }
}
