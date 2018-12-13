package com.issac.design.pattern.structural.decorator.v1;

/**
 *
 * author:  ywy
 * date:    2018-12-12
 * desc:
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg{
    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public int cose() {
        return super.cose() + 2;
    }
}
