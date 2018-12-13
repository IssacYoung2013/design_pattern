package com.issac.design.principle.dependenceinversion;

/**
 *
 * author:  ywy
 * date:    2018-12-08
 * desc:
 */
public class Issac {
//    public void  studyJavaCourse() {
//        System.out.println("Issac在学习Java课程");
//    }
//
//    public void studyFECourse() {
//        System.out.println("Issac在学习前端课程");
//    }
//
//    public void studyPythonCourse() {
//        System.out.println("Issac在学习python课程");
//    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    private ICourse iCourse;

    public Issac() {
    }

    public Issac(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse() {
        this.iCourse.studyCourse();
    }
}

