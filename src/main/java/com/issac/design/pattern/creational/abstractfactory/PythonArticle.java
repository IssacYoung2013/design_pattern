package com.issac.design.pattern.creational.abstractfactory;

/**
 *
 * author:  ywy
 * date:    2018-12-09
 * desc:
 */
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Python课程手记");
    }
}
