package com.zjx.test;

import com.zjx.test.defaultp.DefaultT;

/**
 * @author zjx
 * @Date 2023-10-30 16:10:20
 * @Desc
 */
public class MethodInit3 {

    public int j = 10;

    public static void main(String[] args) {
        DefaultT defaultT = new DefaultT();
        Integer[] nums = new Integer[10];
        for (Integer num : nums) {
            System.out.println(num);
        }
    }

    public static void f1(String ... argss){

    }
}
