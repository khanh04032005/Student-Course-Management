package com.project.model;

public class OfflineCourse extends Course{
    private String location;
    public OfflineCourse(String courseId, String courseName,
                         int credits, String location){
        super(courseId, courseName, credits);
        this.location = location;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.printf(", Location: %s%n", this.location);
    }
}
