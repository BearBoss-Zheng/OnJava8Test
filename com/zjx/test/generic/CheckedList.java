package com.zjx.test.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjx
 * @Date 2023-11-07 23:23:44
 * @Desc
 */
public class CheckedList {
    static void oldStyleMethod(List<Fruit> probablyFruit){
        probablyFruit.add(new Apple());
        probablyFruit.add(new Orange());
    }

    public static void main(String[] args) {
        List<Fruit> list = new ArrayList<>();
        List<Apple> list2 = new ArrayList<>();
        
        System.out.println(list);
    }
}
