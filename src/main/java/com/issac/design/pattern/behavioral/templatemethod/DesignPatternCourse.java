package com.issac.design.pattern.behavioral.templatemethod;

/**
 *
 * author:  ywy
 * date:    2018-12-15
 * desc:
 */
public class DesignPatternCourse extends ACourse {

    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
