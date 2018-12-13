package com.issac.design.pattern.creational.factorymethod;

/**
 *
 * author:  ywy
 * date:    2018-12-08
 * desc:
 */
public class FEVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制FE课程");
    }
}
