package com.issac.design.principle.dependenceinversion;

/**
 *
 * author:  ywy
 * date:    2018-12-08
 * desc:
 */
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Issac在学习Java课程");
    }
}
