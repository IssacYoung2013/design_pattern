package com.issac.design.pattern.creational.prototype.abstractprototype;

/**
 *
 * author:  ywy
 * date:    2018-12-11
 * desc:
 */
public abstract class A  implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
