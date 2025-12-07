package com.project;

import com.project.model.Student;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("1. Add Student");
        System.out.println("2. Display Student");
        System.out.println("3. Exit");
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
                    choice = 3;
                }
                default -> System.out.println("Invalid choice");
            }
        } while (choice != 3);
    }
}
