package com.issac.design.principle.openclose;

/**
 * author:  ywy
 * date:    2018-12-08
 * desc:
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "java从零到企业级开发", 348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        // system.out 有锁
        System.out.println("课程id:" + javaCourse.getId() +
                ",课程名称：" + javaCourse.getName() +
                ",课程原价:" + javaCourse.getOriginPrice() + "元," +
                "课程折后单价:" + javaCourse.getPrice() + "元,");
    }
}
