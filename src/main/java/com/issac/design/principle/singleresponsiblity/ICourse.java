package com.issac.design.principle.singleresponsiblity;

/**
 *
 * author:  ywy
 * date:    2018-12-08
 * desc:
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();
}
