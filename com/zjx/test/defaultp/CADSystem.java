package com.zjx.test.defaultp;

import java.util.Random;

/**
 * @author zjx
 * @Date 2023-10-30 23:46:17
 * @Desc
 */
public class CADSystem extends Shape{
    private Circle c;

    public CADSystem() {
        c = new Circle();

    }


    public void dispose() {
        System.out.println("CADSystem dispose");
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        System.out.println(rand.toString());
        System.out.println(rand.nextInt(5));
    }
}
