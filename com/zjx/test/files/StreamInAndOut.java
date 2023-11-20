package com.zjx.test.files;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author zjx
 * @Date 2023-11-04 14:56:35
 * @Desc
 */
public class StreamInAndOut {
    public static void main(String[] args) {
        try (
                Stream<String> input =
                        Files.lines(Paths.get("F:\\Java\\JavaCode\\OnJava8Test\\com\\zjx\\test\\collection\\AddingGroups.java"));
                PrintWriter output =
                        new PrintWriter("AddingGroups.txt");
                ){
                input.map(String::toUpperCase)
                        .forEach(output::println);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
