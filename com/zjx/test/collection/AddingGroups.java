package com.zjx.test.collection;


import java.util.*;
import java.util.function.IntFunction;

/**
 * @author zjx
 * @Date 2023-11-01 22:50:41
 * @Desc
 */
public class AddingGroups {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        Collections.addAll(collection,6,7,8,9,10);
//        for (Integer integer : collection) {
//            System.out.println(integer);
//        }
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ListIterator<Integer> listIterator = list.listIterator();
        int i = 2;
        while (listIterator.hasNext()){
            listIterator.next();
            listIterator.set(i++);
        }
        Collections.shuffle(list);
        System.out.println(list);


    }
}
