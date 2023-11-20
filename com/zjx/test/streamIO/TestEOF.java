package com.zjx.test.streamIO;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author zjx
 * @Date 2023-11-14 23:29:18
 * @Desc EOF:end of file
 */
public class TestEOF {
    public static void main(String[] args) {
        try (
                DataInputStream in = new DataInputStream(
                        new BufferedInputStream(
                            new FileInputStream(BufferedInputFile.ABSOLUTE_PATH+"TestEOF.java")))
         ){
            while (in.available() != 0)
                System.out.write(in.readByte());
        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
