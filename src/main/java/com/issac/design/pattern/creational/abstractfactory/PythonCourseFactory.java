package com.issac.design.pattern.creational.abstractfactory;

/**
 *
 * author:  ywy
 * date:    2018-12-09
 * desc:
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
