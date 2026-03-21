package com.project.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DataManager {
    private static DataManager instance;
    private Map<String, Course> courses = new HashMap<>();
    private Map<String, Student> students = new HashMap<>();

    private DataManager(){}

    public void addStudent(String Id, Student student){
        students.put(Id, student);
    }
    public void addCourse(String Id, Course course){
        courses.put(Id, course);
    }
    public Map<String, Student> getStudents(){
        return students;
    }
    public Map<String, Course> getCourses(){
        return courses;
    }
    public Student findStudentById(String Id){
        return students.get(Id);
    }
    public Course findCourseById(String Id){
        return courses.get(Id);
    }
    public void listOfCourses(){
        for (String Id : courses.keySet()){
            System.out.print(courses.get(Id) + " ");
        }
    }
    public static DataManager getInstance(){
        if(instance == null){
            instance = new DataManager();
        }
        return instance;
    }
    public void enrollStudentInCourse(String studentId, String courseId){
        Student student = students.get(studentId);
        Course course = courses.get(courseId);
        if(student != null && course != null){
            student.enrollCourse(course);
            course.addStudent(student);
        }
    }

}
