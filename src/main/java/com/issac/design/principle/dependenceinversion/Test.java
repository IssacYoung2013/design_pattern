package com.issac.design.principle.dependenceinversion;

/**
 *
 * author:  ywy
 * date:    2018-12-08
 * desc:
 */
public class Test {
    //v1.0
//    public static void main(String[] args) {
//        Issac issac = new Issac();
//        issac.studyFECourse();
//        issac.studyJavaCourse();
//    }

    // v2.0
//    public static void main(String[] args) {
//        Issac issac = new Issac();
//        issac.studyImoocCourse(new JavaCourse());
//        issac.studyImoocCourse(new FECourse());
//        issac.studyImoocCourse(new PythonCourse());
//    }

    // v3.0 单例
//    public static void main(String[] args) {
//        Issac issac = new Issac(new JavaCourse());
//        issac.studyImoocCourse();
//    }

    public static void main(String[] args) {
        Issac issac = new Issac();
        issac.setiCourse(new JavaCourse());
        issac.studyImoocCourse();

        issac.setiCourse(new FECourse());
        issac.studyImoocCourse();
    }
}
