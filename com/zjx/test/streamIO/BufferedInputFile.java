package com.zjx.test.streamIO;

import java.io.*;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * @author zjx
 * @Date 2023-11-14 22:31:00
 * @Desc
 */
public class BufferedInputFile {

    public static String ABSOLUTE_PATH = "F:\\Java\\JavaCode\\OnJava8Test\\com\\zjx\\test\\streamIO\\";

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
        System.out.print(read("F:\\Java\\JavaCode\\OnJava8Test\\com\\zjx\\test\\streamIO\\BufferedInputFile.java"));
    }
}
