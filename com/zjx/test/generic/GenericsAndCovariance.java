package com.zjx.test.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zjx
 * @Date 2023-11-07 15:11:18
 * @Desc
 */
public class GenericsAndCovariance {

    static List<Apple> apples = Arrays.asList(new Apple());
    static List<Fruit> fruit = Arrays.asList(new Fruit());

    static class Reader<T> {
        T readExact(List<T> list) {
            return list.get(0);
        }
    }

    static void f2() {
        Reader<Fruit> fruitReader = new Reader<>();
        Fruit f = fruitReader.readExact(fruit);
        //- Fruit a = fruitReader.readExact(apples);
        // error: incompatible types: List<Apple>
        // cannot be converted to List<Fruit>
    }

    static class CovariantReader<T> {
        T readCovariant(List<? extends T> list) {
            return list.get(0);
        }

        static void f3() {
            CovariantReader<Fruit> fruitReader = new CovariantReader<>();
            Fruit f = fruitReader.readCovariant(fruit);
            Fruit a = fruitReader.readCovariant(apples);
        }
    }
    //

}




