package org.example;

import java.util.List;

public class GradeCalculator {
    private final Courses courses;



    public GradeCalculator(List<Course> courses) {

        this.courses = new Courses(courses);

    }

    public double calculateGrade() {


        double totalMultipliedCreditAndCourseGrade =  courses.multiplyCreditAndCourseGeade();


        int totalCompletedCreadit=  courses.calculateTotalCompletedCredit();


        return totalMultipliedCreditAndCourseGrade/totalCompletedCreadit;
    }
}
