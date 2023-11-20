package com.zjx.test.collection;

import java.util.LinkedList;

/**
 * @author zjx
 * @Date 2023-11-17 11:33:43
 * @Desc
 */
public class TestPeekMethodOfDeque {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.addLast(i);
        }
        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list.poll());
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list);
    }
}
