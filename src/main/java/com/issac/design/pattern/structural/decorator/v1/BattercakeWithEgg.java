package com.issac.design.pattern.structural.decorator.v1;

/**
 *
 * author:  ywy
 * date:    2018-12-12
 * desc:
 */
public class BattercakeWithEgg extends Battercake {

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cose() {
        return super.cose() + 2;
    }
}
