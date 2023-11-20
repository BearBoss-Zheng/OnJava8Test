package com.zjx.test.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zjx
 * @Date 2023-11-04 23:24:34
 * @Desc
 */
public class EmailExtractor {
    public static void main(String[] args) {
        // Sample text containing email addresses
        String text = "Contact us at support@example.com or info@company.com.";

        // Regular expression for matching email addresses
        String emailRegex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(emailRegex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(text);

        // Find and print all email addresses in the text
        while (matcher.find()) {
            System.out.println("Found email: " + matcher.group());
        }


    }
}
