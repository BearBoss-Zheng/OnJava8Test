package com.zjx.test.streamIO;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 * @author zjx
 * @Date 2023-11-14 23:21:17
 * @Desc
 */
public class FormattedMemoryInput {
    public static void main(String[] args) {
        try(
                DataInputStream in = new DataInputStream(
                new ByteArrayInputStream(BufferedInputFile.read(BufferedInputFile.ABSOLUTE_PATH+"FormattedMemoryInput.java")
                        .getBytes()))) {
            while (true) System.out.write((char) in.readByte());
        }catch (EOFException e){
            System.out.println("\nEnd of stream");
        }catch (IOException e){
            throw new RuntimeException(e);
        }



    }
}
