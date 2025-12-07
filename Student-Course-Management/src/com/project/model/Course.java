package com.project.model;

public class Course {

    private String courseId;
    private String courseName;
    private int credits;

    public Course(String courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    String getCourseId() {
        return this.courseId;
    }

    String getCourseName() {
        return this.courseName;
    }

    int getCredits() {
        return this.credits;
    }

}
