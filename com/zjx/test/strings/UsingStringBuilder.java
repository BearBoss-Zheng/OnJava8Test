package com.zjx.test.strings;

import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author zjx
 * @Date 2023-11-04 19:47:58
 * @Desc
 */
public class UsingStringBuilder {
    public static String str1() {
        StringBuilder result = new StringBuilder("[");
        Random random = new Random(47);
        for (int i = 0; i < 30; i++) {
            int nextInt = random.nextInt(40);
            result.append(nextInt);
            result.append("，");
        }
        result.delete(result.length()-1,result.length());
        result.append("]");
        return result.toString();
    }

    public static String str2(){
        String res = new Random(47)
                .ints(2,10,30)
                .mapToObj(Integer :: toString)
                .collect(Collectors.joining("，"));
        return "{"+res+"}";
    }

    public static void main(String[] args) {
        System.out.println(str1());
        System.out.println(str2());
    }
}
