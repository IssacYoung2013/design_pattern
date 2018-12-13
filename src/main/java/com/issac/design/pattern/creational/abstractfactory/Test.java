package com.issac.design.pattern.creational.abstractfactory;

/**
 *
 * author:  ywy
 * date:    2018-12-09
 * desc:
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
