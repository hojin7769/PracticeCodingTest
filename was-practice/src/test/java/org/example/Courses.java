package org.example;

import java.util.List;

public class Courses {

    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGeade() {
        return courses.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();
    }

    public int calculateTotalCompletedCredit() {

        int totalCompletedCreadit = courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
        return totalCompletedCreadit;
    }
}
