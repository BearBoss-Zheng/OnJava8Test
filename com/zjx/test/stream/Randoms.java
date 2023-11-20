package com.zjx.test.stream;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;

import static java.util.stream.IntStream.range;

/**
 * @author zjx
 * @Date 2023-11-02 20:39:25
 * @Desc
 */
public class Randoms {
    public static void main(String[] args) {
        new Random(47)
                .ints(1,20)
                .distinct()
                .limit(7)
                .sorted()
                .forEach(System.out::println);


    }
}
