package org.example;

import java.util.List;

/**
 * author :  sanghoonkim
 * date : 2022/12/28
 */
public class GradeCalculator {
    private final Courses courses;


    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public GradeCalculator(Courses courses) {
        this.courses = courses;
    }

    public double calculateGrade() {

        //(학점수*교과목 평점)의 합계
        double totalMultiplyCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();

        //수강신청 총학점수
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();

        return totalMultiplyCreditAndCourseGrade / totalCompletedCredit;
    }
}
