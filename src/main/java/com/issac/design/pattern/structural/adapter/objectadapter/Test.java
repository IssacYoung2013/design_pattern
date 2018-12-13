package com.issac.design.pattern.structural.adapter.objectadapter;

import com.issac.design.pattern.structural.adapter.classadapter.Adapter;
import com.issac.design.pattern.structural.adapter.classadapter.ConcreteTarget;
import com.issac.design.pattern.structural.adapter.classadapter.Target;

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
