package com.issac.design.pattern.structural.adapter.classadapter;

/**
 *
 * author:  ywy
 * date:    2018-12-12
 * desc:
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();


    }
}
