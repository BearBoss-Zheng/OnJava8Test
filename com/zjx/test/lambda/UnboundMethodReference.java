package com.zjx.test.lambda;

/**
 * @author zjx
 * @Date 2023-11-02 16:26:11
 * @Desc
 */

class X {
    X(){

    }
    String f() {
        return "X::f()";
    }
}

interface MakeString {
    String make();
}

interface TransformX {
    String transform(X x);
}



public class UnboundMethodReference {
    public static void main(String[] args) {
        X x2 = new X();
         TransformX sp = X::f;
         X x = new X();
         System.out.println(sp.transform(x)); // [2]
         System.out.println(x.f()); // 同 等 效 果
         }
}
