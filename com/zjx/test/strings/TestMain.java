package com.zjx.test.strings;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author zjx
 * @Date 2023-11-05 23:22:22
 * @Desc
 */
public class TestMain {

    public static void main(String[] args) throws Exception {
        Integer[] num = new Integer[5];
        Integer i = num[2];
        i = 5;
        for (Integer integer : num) {
            System.out.println(integer);
        }

    }
}
