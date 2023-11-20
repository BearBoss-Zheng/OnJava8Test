package com.zjx.test.standardIO;
import com.zjx.test.streamIO.BufferedInputFile;

import java.io.*;

/**
 * @author zjx
 * @Date 2023-11-15 23:39:27
 * @Desc
 */
public class Redirecting {
    static String PATH = "F:\\Java\\JavaCode\\OnJava8Test\\com\\zjx\\test\\standardIO\\";

    public static void main(String[] args) {
        PrintStream console = System.out;
        try (
                BufferedInputStream in = new BufferedInputStream(
                        new FileInputStream(PATH+"Redirecting.java"));
                PrintStream out = new PrintStream(
                        new BufferedOutputStream(
                                new FileOutputStream(PATH+"Redirecting.txt")))
        ) {
            System.setIn(in);
            System.setOut(out);
            System.setErr(out);
            new BufferedReader(
                    new InputStreamReader(System.in))
                    .lines()
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.setOut(console);
        }
    }
}
