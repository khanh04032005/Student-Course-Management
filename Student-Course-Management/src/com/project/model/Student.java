package com.project.model;

import java.util.*;

public class Student implements IPrintable {
    private String studentId;
    private String email;
    private String name;
    private Set<Course> enrolledCourses = new HashSet<>();
    public Student(String studentId, String email, String name) {
        this.studentId = studentId;
        this.email = email;
        this.name = name;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void printInfo() {
        System.out.printf("ID: %s, name: %s, email: %s\n", this.studentId, this.name, this.email);
    }
    @Override
    public void displayDetails(){
        printInfo();
    }
    public void enrollCourse(Course course){
        if(enrolledCourses.contains(course)){
            System.out.println("Course already exists!");
        }
        else {
            enrolledCourses.add(course);
            System.out.println("Enrolled in: " + course.getCourseName());
        }
    }

    public void removeCourse(Course course){
        if(!enrolledCourses.contains(course)){
            System.out.println("Course does not exist!");
        }
        else {
            enrolledCourses.remove(course);
            System.out.println("Removed course: " + course.getCourseName());
        }
    }

    public void listCourse(){
        System.out.println(enrolledCourses);
    }
}
