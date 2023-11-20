package com.zjx.test.strings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author zjx
 * @Date 2023-11-04 20:26:36
 * @Desc
 */
public class StringTest {
    public static void main(String[] args) {
        String result = Stream.of("a", "s", "d", "s", "a")
                .collect(Collectors.joining());

        System.out.println(result.substring(0,result.length()));
        System.out.format("Row 1: [%d %f]%n", 5, 5.534564);
        System.out.println("asds");
        System.out.format("This is a literal percent sign: %%n%n");

    }
}
