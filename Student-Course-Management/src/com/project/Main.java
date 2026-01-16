package com.project;

import com.project.exception.InvalidDataException;
import com.project.model.*;
import com.project.utils.InputHandler;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)

    {
        DataManager manager = DataManager.getInstance();
        int choice;
        System.out.println("1. Add Student");
        System.out.println("2. Display Student");
        System.out.println("3. Add Course");
        System.out.println("4. Display Course");
        System.out.println("5. Enroll Student in Course.");
        System.out.println("6. Exit");
        do {
            choice = InputHandler.getInt("Enter choice: ", "choice");
            switch (choice) {
                case 1 -> {
                    String id = InputHandler.getString("Enter ID: ", "ID");
                    String name = InputHandler.getString("Enter name: ", "name");
                    String email = InputHandler.getEmail("Enter Email: ");
                    Student student = new Student(id, email, name);
                    manager.addStudent(id, student);
                    System.out.print("Would you like to enroll in any courses? (Y/N): ");
                    boolean is_enrolled = InputHandler.isEnrolled();
                    if(is_enrolled) {
                        System.out.println("List of courses: ");
                        for(String c : manager.getCourses().keySet()){
                            manager.getCourses().get(c);
                        }
                        System.out.println(manager.getCourses());
                        Course course = InputHandler.findCourse("Enter CourseId to enroll: ");
                        manager.enrollStudentInCourse(id, course.getCourseId());
                    }

                }
                case 2 -> {
                    for (Student e : manager.getStudents().values()) {
                        e.displayDetails();
                    }
                }
                case 3 -> {
                    String option;
                    System.out.println("3.1. OnlineCourse");
                    System.out.println("3.2. OfflineCourse");
                    option = InputHandler.getOption("Enter your option: ");
                    String id = InputHandler.getString("Enter ID: ", "ID");
                    String name = InputHandler.getString("Enter Name: ", "name");
                    int credits = InputHandler.getInt("Enter Credits: ", "Credits");
                    Course course = null;
                    switch(option){
                        case "3.1" -> {
                            String platform = InputHandler.getString("Enter Platform: ", "platform");
                            course = new OnlineCourse(id, name, credits, platform);

                        }
                        case "3.2" -> {
                            String location = InputHandler.getString("Enter Location: ", "location");
                            course = new OfflineCourse(id, name, credits, location);
                        }
                    }
                    manager.addCourse(id, course);
                }
                case 4 -> {
                    for(Course c : manager.getCourses().values()){
                        c.displayDetails();
                    }
                }
                case 5 -> {
                    Student student = InputHandler.findStudent("Enter Student ID to enroll: ");
                    Course course = InputHandler.findCourse("Enter Course ID to enroll: ");
                    manager.enrollStudentInCourse(student.getStudentId(), course.getCourseId());
                }
                default -> System.out.println("Invalid choice");
            }
        } while (choice != 6);


    }
}
