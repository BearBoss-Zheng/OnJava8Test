package com.zjx.test.asserts;


/**
 * @author zjx
 * @Date 2023-11-04 10:20:53
 * @Desc
 */
public class LoaderAssertion {
    public static void main(String[] args) {
        ClassLoader.getSystemClassLoader()
                .setDefaultAssertionStatus(true);
        new Loaded().go();

    }
}
class Loaded{
    public void go(){
        assert false:"有错误";
    };

}
