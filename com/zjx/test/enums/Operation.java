package com.zjx.test.enums;

/**
 * @author zjx
 * @Date 2023-11-10 22:03:12
 * @Desc
 */
public enum Operation {
    ADD {
        @Override
        public int operate(int x, int y) {
            return x + y;
        }

        @Override
        public void description() {
            System.out.println("Addition operation");
        }
    },
    SUBTRACT {
        @Override
        public int operate(int x, int y) {
            return x - y;
        }

        @Override
        public void description() {
            System.out.println("Subtraction operation");
        }
    };

    public abstract int operate(int x, int y);

    public void description(){};
}
