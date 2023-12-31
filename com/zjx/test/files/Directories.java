package com.zjx.test.files;
 import java.util.*;
 import java.nio.file.*;

/**
 * @author zjx
 * @Date 2023-11-04 13:24:48
 * @Desc
 */
public class Directories {
    static Path test = Paths.get("test");
    static String sep = FileSystems.getDefault().getSeparator();
    static List<String> parts = Arrays.asList("foo", "bar", "baz", "bag");

    static Path makeVariant() {
        Collections.rotate(parts, 1);
        return Paths.get("test", String.join(sep, parts));
    }

    static void refreshTestDir() throws Exception {
        if (Files.exists(test))
            RmDir.rmdir(test);
        if (!Files.exists(test))
            Files.createDirectory(test);
    }

    public static void main(String[] args) throws Exception {
        refreshTestDir();
        Files.createFile(test.resolve("Hello.txt"));
        Path variant = makeVariant();
        // Throws exception (too many levels):
        try {
             Files.createDirectory(variant);

        } catch (Exception e) {
             System.out.println("Nope, that doesn't work.");
        }
        populateTestDir();
        Path tempdir = Files.createTempDirectory(test, "DIR_");
        Files.createTempFile(tempdir, "pre", ".non");
        Files.newDirectoryStream(test).forEach(System.out::println);
        System.out.println("*********");
        Files.walk(test).forEach(System.out::println);
    }

    static void populateTestDir() throws Exception {
        for (int i = 0; i < parts.size(); i++) {
             Path variant = makeVariant();
             if (!Files.exists(variant)) {
                 Files.createDirectories(variant);
                 Files.copy(Paths.get("简.docx"),
                      variant.resolve("File.docx"));
                 Files.createTempFile(variant, null, null);

            }

        }
    }

}
