package com.zjx.test.files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author zjx
 * @Date 2023-11-04 14:45:10
 * @Desc
 */
public class ReadLineStream {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\zjx\\Desktop\\JVM随记.doc");
        Files.lines(path, StandardCharsets.UTF_8)
                .forEach(System.out::println);

    }
}
