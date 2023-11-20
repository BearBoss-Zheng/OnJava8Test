package com.zjx.test.strings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author zjx
 * @Date 2023-11-04 21:39:10
 * @Desc
 */
public class Hex {
    public static String format(byte[] data) {
        StringBuilder result = new StringBuilder();
        int n = 0;
        for (byte b : data) {
            if (n % 16 == 0) {
                result.append(String.format("%07x:", n));
            }
            result.append(String.format("%-4x", b));
            n++;
            if (n % 16 == 0) {
                result.append("\n");
            }
        }
        result.append("/n");
        return result.toString();
    }

    public static void main(String[] args) throws IOException {
//        System.out.println(format(Files.readAllBytes(Paths.get("AddingGroups.txt"))));
        System.out.println("aaa".matches("a{1,4}"));


    }
}
