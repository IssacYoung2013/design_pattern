package com.issac.design.pattern.structural.decorator.v2;

/**
 *
 * author:  ywy
 * date:    2018-12-12
 * desc:
 */
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int cose() {
        return super.cose() + 1;
    }

    @Override
    protected void doSomething() {
        System.out.println(" 敲碎蛋");
    }
}
