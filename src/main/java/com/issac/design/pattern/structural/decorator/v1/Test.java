package com.issac.design.pattern.structural.decorator.v1;

/**
 *
 * author:  ywy
 * date:    2018-12-12
 * desc:
 */
public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + " 销售价格：" + battercake.cose());

        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc() + " 销售价格：" + battercakeWithEgg.cose());

        BattercakeWithEggSausage battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc() + " 销售价格：" + battercakeWithEggSausage.cose());

    }
}
