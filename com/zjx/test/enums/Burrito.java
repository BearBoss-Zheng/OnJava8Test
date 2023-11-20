package com.zjx.test.enums;

import static com.zjx.test.enums.Spiciness.*;

/**
 * @author zjx
 * @Date 2023-11-09 14:45:23
 * @Desc
 */
public class Burrito {

    Spiciness degree;

    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Burrito is " + degree;
    }

    public static void main(String[] args) {
        System.out.println(new Burrito(NOT));
        System.out.println(new Burrito(MEDIUM));
        System.out.println(new Burrito(HOT));
    }

}
