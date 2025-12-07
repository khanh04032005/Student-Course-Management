package com.project.model;

public class Student {
    private String StudentId;
    private String email;
    private String name;

    public Student(String StudentId, String email, String name) {
        this.StudentId = StudentId;
        this.email = email;
        this.name = name;
    }

    public String getStudentId() {
        return this.StudentId;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void displayInfo() {
        System.out.println("ID: " + this.StudentId + ", name: " + this.name + ", email: " + this.email);
    }
}
