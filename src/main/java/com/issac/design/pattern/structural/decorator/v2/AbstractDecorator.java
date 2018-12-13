package com.issac.design.pattern.structural.decorator.v2;

/**
 *
 * author:  ywy
 * date:    2018-12-12
 * desc:
 */
public abstract class AbstractDecorator extends  ABattercake {

    private  ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    protected abstract  void doSomething();

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cose() {
        return this.aBattercake.cose();
    }
}
