package com.zjx.test.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zjx
 * @Date 2023-11-04 23:09:18
 * @Desc
 */
public class PatternTest {
    public static void main(String[] args) {
        // Check if the command-line arguments are less than 2
        if (args.length < 2) {
            System.out.println("Usage:\njava TestRegularExpression " +
                    "characterSequence regularExpression+");
            System.exit(0); // Exit the program if there are not enough arguments
        }
        System.out.println("Input: \"" + args[0] + "\"");

        // Iterate over each regular expression provided as command-line arguments
        for (String arg : args) {
            System.out.println("Regular expression: \"" + arg + "\"");

            // Compile the regular expression pattern
            Pattern p = Pattern.compile(arg);

            // Create a matcher for the input character sequence (args[0])
            Matcher m = p.matcher(args[0]);

            // Iterate through the matches found in the input character sequence
            while (m.find()) {
                System.out.println("Match \"" + m.group() + "\" at positions " +
                        m.start() + "-" + (m.end() - 1));
            }
        }
    }

}
