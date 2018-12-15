package com.issac.design.pattern.behavioral.iterator;

/**
 *
 * author:  ywy
 * date:    2018-12-15
 * desc:
 */
public class Test {
    public static void main(String[] args) {
        Course course1 = new Course("Java电商一期");
        Course course2 = new Course("Java电商二期");
        Course course3 = new Course("Java电商三期");
        Course course4 = new Course("Java电商四期");
        Course course5 = new Course("Java电商五期");
        Course course6 = new Course("Java电商六期");

        CourseAggregate courseAggregate = new CourseAggregateImpl();
        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);
        courseAggregate.addCourse(course6);
        printCourse(courseAggregate);

        courseAggregate.removeCourse(course1);
        System.out.println("删除后=======");
        printCourse(courseAggregate);
    }

    public static void printCourse(CourseAggregate courseAggregate) {
        CourseIterator courseIterator = courseAggregate.getCouseIterator();
        while (!courseIterator.isLastCourse()) {
            Course course = courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }
}
