package com.zjx.test.generic;

import com.zjx.test.strings.Person;

import java.util.function.Supplier;

/**
 * @author zjx
 * @Date 2023-11-06 14:44:19
 * @Desc
 */
public class GenericT {
    public static void main(String[] args) {

    }
}
class PersonFac<T> implements Supplier<T>{
    Class<T> kind;
    T obj;

    @Override
    public T get() {
        try {
            return kind.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
