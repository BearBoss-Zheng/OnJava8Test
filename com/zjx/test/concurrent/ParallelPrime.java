package com.zjx.test.concurrent;


import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.function.LongSupplier;
import java.util.stream.Collectors;

import static java.util.stream.IntStream.iterate;
import static java.util.stream.LongStream.rangeClosed;

/**
 * @author zjx
 * @Date 2023-11-12 22:23:52
 * @Desc
 */
public class ParallelPrime {


    static final int COUNT = 100_000;

    public static boolean isPrime(long n) {
        return rangeClosed(2, (long) Math.sqrt(n)).noneMatch(i -> n % i == 0);
    }

    public static void main(String[] args) throws IOException {
//        Timer timer = new Timer();
//        List<String> primes =
//                iterate(2, i -> i + 1)
//                        .parallel() // [1]
//                        .filter(ParallelPrime::isPrime)
//                        .limit(COUNT)
//                        .mapToObj(Long::toString)
//                        .collect(Collectors.toList());
//        System.out.println(timer.duration());
//        Files.write(Paths.get("primes.txt"), primes, StandardOpenOption


    }

}
