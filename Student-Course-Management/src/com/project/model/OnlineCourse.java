package com.project.model;

public class OnlineCourse extends Course {
    private String platform;
    public OnlineCourse(String courseId, String courseName,
                         int credits, String platform){
        super(courseId, courseName, credits);
        this.platform = platform;
    }
    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform){
        this.platform = platform;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.printf(", Platform: %s%n", this.platform);
    }
}
