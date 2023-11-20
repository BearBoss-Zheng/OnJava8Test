package com.zjx.test.enums;

/**
 * @author zjx
 * @Date 2023-11-10 22:35:31
 * @Desc
 */
public interface Competitor<T extends Competitor<T>> {
    Outcome compete(T competitor);
}
