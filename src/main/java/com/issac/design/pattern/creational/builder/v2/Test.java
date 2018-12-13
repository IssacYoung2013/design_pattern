package com.issac.design.pattern.creational.builder.v2;

/**
 *
 * author:  ywy
 * date:    2018-12-09
 * desc:
 */
public class Test {
    public static void main(String[] args) {

        Course course = new Course.CourseBuilder().builderCourseName("java设计模式精讲")
                .buildCoursePPT("java设计模式PPT").buildCourseArticle("java设计模式视频").build();

        System.out.println(course);
    }
}
