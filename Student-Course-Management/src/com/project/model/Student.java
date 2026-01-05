package com.project.model;

public class Student {
    private String studentId;
    private String email;
    private String name;

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

    public void displayInfo() {
        System.out.printf("ID: %s, name: %s, email: %s\n", this.studentId, this.name, this.email);
    }
}
