package com.issac.design.pattern.structural.adapter.classadapter;

/**
 *
 * author:  ywy
 * date:    2018-12-12
 * desc:
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget：目标方法");
    }
}
