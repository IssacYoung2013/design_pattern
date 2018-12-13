package com.issac.design.pattern.structural.adapter;

/**
 *
 * author:  ywy
 * date:    2018-12-13
 * desc:
 */
public class Test {

    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.output5V();
    }
}
