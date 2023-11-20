package com.zjx.test.streamIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

/**
 * @author zjx
 * @Date 2023-11-14 23:46:29
 * @Desc
 */
public class FileOutputShortcut {
    static String file = BufferedInputFile.ABSOLUTE_PATH + "FileOutputShortcut.dat";

    public static void main(String[] args) {
        try(
                BufferedReader in = new BufferedReader(
                        new StringReader(
                                BufferedInputFile.read(
                                        BufferedInputFile.ABSOLUTE_PATH+ "FileOutputShortcut.java")));
                //Here's the shortcut
                PrintWriter out = new PrintWriter(file);
                ) {
            in.lines().
                    forEach(out :: println);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        System.out.println(BufferedInputFile.read(file));
    }
}
