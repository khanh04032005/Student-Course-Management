package com.project.model;

import java.util.HashSet;
import java.util.Set;

public abstract class Course implements IPrintable {

    protected String courseId;
    protected String courseName;
    protected int credits;
    protected Set<Student> enrolledStudents = new HashSet<>();

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

    public void printInfo(){
        System.out.printf("CourseId: %s, CourseName: %s, Credits: %d", this.courseId, this.courseName, this.credits);
    }

    @Override
    public void displayDetails(){
        printInfo();
    }

    public void addStudent(Student student){
        enrolledStudents.add(student);
    }

    public void removeStudent(Student student){
        enrolledStudents.remove(student);
    }

}
