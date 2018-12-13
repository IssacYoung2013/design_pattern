package com.issac.design.pattern.creational.factorymethod;

/**
 *
 * author:  ywy
 * date:    2018-12-08
 * desc:
 */
public class FEVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
