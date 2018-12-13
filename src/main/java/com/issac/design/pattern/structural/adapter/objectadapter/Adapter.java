package com.issac.design.pattern.structural.adapter.objectadapter;

/**
 *
 * author:  ywy
 * date:    2018-12-13
 * desc:
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
