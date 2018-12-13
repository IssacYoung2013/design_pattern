package com.issac.design.pattern.structural.adapter.classadapter;

/**
 *
 * author:  ywy
 * date:    2018-12-12
 * desc:
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
