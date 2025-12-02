package com.project;

public class Student {
    private String StudentId;
    private String email;
    private String name;

    public Student(String StudentId, String email, String name){
        this.StudentId = StudentId;
        this.email = email;
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("ID: " + this.StudentId + ", name: " + this.name + ", email: " + this.email);
    }
}
