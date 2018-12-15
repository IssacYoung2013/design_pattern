package com.issac.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * author:  ywy
 * date:    2018-12-15
 * desc:
 */
public class CourseAggregateImpl implements CourseAggregate {

    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        this.courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        this.courseList.remove(course);
    }

    @Override
    public CourseIterator getCouseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
