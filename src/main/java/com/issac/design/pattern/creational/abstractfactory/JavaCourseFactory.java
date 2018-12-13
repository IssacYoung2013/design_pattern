package com.issac.design.pattern.creational.abstractfactory;

/**
 *
 * author:  ywy
 * date:    2018-12-09
 * desc:
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
