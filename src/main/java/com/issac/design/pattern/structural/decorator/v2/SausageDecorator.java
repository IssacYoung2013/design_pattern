package com.issac.design.pattern.structural.decorator.v2;

/**
 *
 * author:  ywy
 * date:    2018-12-12
 * desc:
 */
public class SausageDecorator extends AbstractDecorator{
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根火腿";
    }

    @Override
    protected int cose() {
        return super.cose() + 2;
    }

    @Override
    protected void doSomething() {
        System.out.println(" 剥香肠外皮");
    }
}
