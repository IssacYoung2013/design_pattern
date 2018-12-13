package com.issac.design.pattern.structural.decorator.v2;

/**
 * author:  ywy
 * date:    2018-12-12
 * desc:
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cose() {
        return 8;
    }
}
