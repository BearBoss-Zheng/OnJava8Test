package com.zjx.test.streamIO;

import java.io.IOException;
import java.io.StringReader;

/**
 * @author zjx
 * @Date 2023-11-14 23:06:01
 * @Desc
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(
                BufferedInputFile.read(BufferedInputFile.ABSOLUTE_PATH+"MemoryInput.java"));
        int c ;
        while ((c = in.read()) != -1){
            System.out.print((char) c);
        }
    }
}