package com.zjx.test.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Proxy;

/**
 * @author zjx
 * @Date 2023-11-05 10:01:17
 * @Desc
 */
public class SimpleRead {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new StringReader("hi me name is tom\n i'm 25 years old"));
        String s = input.readLine();
        System.out.println(s);
        System.out.println(input.readLine());
    }
}
