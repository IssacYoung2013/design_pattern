package com.issac.design.pattern.behavioral.iterator;

/**
 *
 * author:  ywy
 * date:    2018-12-15
 * desc:
 */
public interface CourseIterator {
    Course nextCourse();
    boolean isLastCourse();
}
