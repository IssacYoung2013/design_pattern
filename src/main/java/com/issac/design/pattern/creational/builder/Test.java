package com.issac.design.pattern.creational.builder;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

/**
 * author:  ywy
 * date:    2018-12-09
 * desc:
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("java设计模式精讲", "java设计模式PPT"
                , "java设计模式视频", "java设计模式手记", "java设计模式QA"
        );
        System.out.println(course);

        Set<String> set = ImmutableSet.<String>builder().add("a").add("b").build();
        System.out.println(set);

    }
}
