package com.project;

import com.project.model.Course;
import com.project.model.OfflineCourse;
import com.project.model.OnlineCourse;
import com.project.model.Student;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>();
        int choice;
        System.out.println("1. Add Student");
        System.out.println("2. Display Student");
        System.out.println("3. Add Course");
        System.out.println("4. Display Course");
        System.out.println("5. Exit");
        do {
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    String Id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    Student student = new Student(Id, email, name);
                    students.add(student);
                }
                case 2 -> {
                    for (Student e : students) {
                        e.displayInfo();
                    }
                }
                case 3 -> {
                    String option;
                    System.out.println("3.1. OnlineCourse");
                    System.out.println("3.2. OfflineCourse");
                    System.out.print("Enter your option: ");
                    option = scanner.nextLine();
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Credits: ");
                    int credits = scanner.nextInt();
                    scanner.nextLine();
                    Course course = null;
                    switch(option){
                        case "3.1" -> {
                            System.out.print("Enter Platform: ");
                            String platform = scanner.nextLine();
                            course = new OnlineCourse(id, name, credits, platform);

                        }
                        case "3.2" -> {
                            System.out.print("Enter Location: ");
                            String location = scanner.nextLine();
                            course = new OfflineCourse(id, name, credits, location);
                        }
                        default -> System.out.println("Invalid option");
                    }
                    courses.add(course);
                }
                case 4 -> {
                    for(Course c : courses){
                        c.displayInfo();
                    }
                }
                default -> System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }
}
