package com.issac.design.pattern.behavioral.templatemethod;

/**
 *
 * author:  ywy
 * date:    2018-12-15
 * desc:
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("后端设计模式课程 start --");
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端设计模式课程 end --");

        System.out.println("前端课程 start");
        ACourse feCourse = new FECourse(false);
        feCourse.makeCourse();
        System.out.println("前端课程 end");

    }
}
