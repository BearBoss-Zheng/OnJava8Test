package com.zjx.test.streamIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.stream.Collectors;

/**
 * @author zjx
 * @Date 2023-11-14 23:01:56
 * @Desc
 */
public class TestIO {
    public static String read(String filename){
        try (BufferedReader in = new BufferedReader(
                new FileReader(filename))){
            return in.lines()
                    .collect(Collectors.joining("\n"));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        int BSIZE = 1024;
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        int limit = 5;
        System.out.println(limit);
        int i = 0;
        while (i++ < limit){
            if (bb.get() != 0){
                System.out.println("zerp");
            }
        }
        System.out.println(i);

    }
}
