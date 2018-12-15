package com.issac.design.pattern.behavioral.iterator;

/**
 *
 * author:  ywy
 * date:    2018-12-15
 * desc:
 */
public interface CourseAggregate {
    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCouseIterator();
}
