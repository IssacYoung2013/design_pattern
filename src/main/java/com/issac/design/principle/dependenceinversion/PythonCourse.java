package com.issac.design.principle.dependenceinversion;

/**
 *
 * author:  ywy
 * date:    2018-12-08
 * desc:
 */
public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Issac在学习python课程");
    }
}
