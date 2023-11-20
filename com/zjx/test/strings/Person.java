package com.zjx.test.strings;

import java.util.Optional;

/**
 * @author zjx
 * @Date 2023-11-05 23:21:12
 * @Desc
 */
public class Person {
    public String name;

    public Integer age;

    public Person(String name,Integer age) throws Exception {
       this.name = Optional.ofNullable(name)
               .orElseThrow(Exception :: new);
        this.age = Optional.ofNullable(age)
               .orElseThrow(Exception :: new);
    }



    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
