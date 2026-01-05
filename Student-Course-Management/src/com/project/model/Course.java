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

    public String getCourseId() {
        return this.courseId;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public int getCredits() { return this.credits; }

    public void displayInfo(){
        System.out.printf("CourseId: %s, CourseName: %s, Credits: %d", this.courseId, this.courseName, this.credits);
    }

}
