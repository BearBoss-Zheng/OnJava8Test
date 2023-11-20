package com.zjx.test;

/**
 * @author zjx
 * @Date 2023-11-16 13:51:07
 * @Desc
 */
public class NumberFormats {
    public static void main(String[] args) {
        int binaryNumber = 0b101010;
        int octalNumber = 01234;
        int decimalNumber = 1234;
        int hexNumber = 0x1A3;

        System.out.println("Binary: " + binaryNumber);
        System.out.println("Octal: " + octalNumber);
        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Hexadecimal: " + hexNumber);
        System.out.println(int.class);
    }
}

