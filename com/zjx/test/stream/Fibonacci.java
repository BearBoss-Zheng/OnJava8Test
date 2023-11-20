package com.zjx.test.stream;

import java.util.stream.Stream;

/**
 * @author zjx
 * @Date 2023-11-02 21:27:39
 * @Desc
 */
public class Fibonacci {
    Stream.Builder<String> builder = Stream.builder();
        int x = 1;
        Stream<Integer> numbers() {
            return Stream.iterate(0, i -> {
                int result = x + i;
                x = i;
                return result;
            });
        }

    public static void main(String[] args) {
        new Fibonacci().numbers().limit(10).forEach(System.out::println);

    }

}
