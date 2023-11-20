package com.zjx.test.defaultp;

/**
 * @author zjx
 * @Date 2023-10-30 23:44:32
 * @Desc
 */
public class Circle extends Shape{
    public Circle() {
        System.out.println("Circle Constructor");
    }


    public void dispose() {
        System.out.println("Circle dispose");
    }
}
