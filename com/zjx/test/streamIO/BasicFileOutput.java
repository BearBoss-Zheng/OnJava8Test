package com.zjx.test.streamIO;

import java.io.*;



/**
 * @author zjx
 * @Date 2023-11-14 23:34:04
 * @Desc
 */
public class BasicFileOutput {
    static String file = BufferedInputFile.ABSOLUTE_PATH + "BasicFileOutput.dat";

    public static void main(String[] args) {
        try (
                BufferedReader in = new BufferedReader(
                        new StringReader(
                                BufferedInputFile.read(
                                        BufferedInputFile.ABSOLUTE_PATH+"BasicFileOutput.java")));
                PrintWriter out = new PrintWriter(
                        new BufferedWriter(new FileWriter(file)))
                ){
            in.lines()
                    .forEach(out::println);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        //show the stored file:
        System.out.println(BufferedInputFile.read(file));

    }
}
