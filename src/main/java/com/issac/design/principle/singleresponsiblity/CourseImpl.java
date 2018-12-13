package com.issac.design.principle.singleresponsiblity;

/**
 *
 * author:  ywy
 * date:    2018-12-08
 * desc:
 */
public class CourseImpl implements ICourseContent,ICoursemanager {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
