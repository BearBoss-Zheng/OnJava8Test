package com.zjx.test.strings;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author zjx
 * @Date 2023-11-04 20:13:48
 * @Desc
 */
public class ArrayListDisplay {
    public static void main(String[] args) {
        Random random = new Random(47);
        ArrayList<Coffee> strings = Stream.generate(() -> new Coffee(random.nextInt(10)))
                .limit(10)
                .collect(Collectors.toCollection(ArrayList::new));
        for (Coffee string : strings) {
            System.out.println(string);
        }
    }
}
class Coffee implements Supplier {

    int val;

    public Coffee(int val) {
        this.val = val;
    }

    @Override
    public Object get() {
        return val;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "val=" + val +
                '}';
    }
}