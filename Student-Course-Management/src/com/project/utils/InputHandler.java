package com.project.utils;

import com.project.exception.CourseNotFoundException;
import com.project.exception.InvalidDataException;
import com.project.model.Course;
import com.project.model.DataManager;
import com.project.model.Student;

import java.util.Scanner;

public class InputHandler {
    private static final Scanner scanner = new Scanner(System.in);
    private static final DataManager manager = DataManager.getInstance();
    public static int getInt(String prompt, String field){
        System.out.print(prompt);
        while(true){
            try {
                int value = Integer.parseInt(scanner.nextLine());
                if (value <= 0) throw new InvalidDataException(field.toUpperCase() + " must greater than 0!");
                return value;
            } catch (InvalidDataException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + field.toUpperCase() + " must be a number!");
            }
            System.out.print("Enter again: ");
        }
    }

    public static String getString(String prompt, String field){
        System.out.print(prompt);
        while(true){
            try {
                String value = scanner.nextLine().trim();
                if (value.isEmpty()) throw new InvalidDataException(field.toUpperCase() + " must not be blank!");
                return value;
            } catch (InvalidDataException e){
                System.out.println("Error: " + e.getMessage());
            }
            System.out.print("Enter again: ");
        }
    }

    public static String getEmail(String prompt){
        System.out.print(prompt);
        while(true){
            try{
                String value = scanner.nextLine().trim();
                if(!value.contains("@")) throw new InvalidDataException("EMAIL must contain @!");
                return value;
            } catch (InvalidDataException e){
                System.out.println("Error: " + e.getMessage());
            }
            System.out.print("Enter agian: ");
        }
    }

    public static String getOption(String prompt){
        System.out.print(prompt);
        while(true){
            try {
                String value = scanner.nextLine().trim();
                if (value.isEmpty()) throw new InvalidDataException("OPTION must not be blank!");
                if (!(value.equals("3.1") || value.equals("3.2"))) throw new InvalidDataException
                        ("OPTION must be 3.1 or 3.2!");
                return value;
            } catch (InvalidDataException e){
                System.out.println("Error: " + e.getMessage());
            }
            System.out.print("Enter again: ");
        }
    }
    public static boolean isEnrolled(){
        while(true){
            try {
                String value = scanner.nextLine().trim().toUpperCase();
                if(value.isEmpty()) throw new InvalidDataException("OPTION must not be blank!");
                if (!(value.equals("Y") || value.equals("N"))) throw new InvalidDataException
                        ("OPTION must be Y or N!");
                return value.equals("Y");
            } catch(InvalidDataException e){
                System.out.println("Error: " + e.getMessage());
            }
            System.out.print("Enter again: ");
        }
    }

    public static Course findCourse(String prompt){
        System.out.print(prompt);
        while(true){
            try {
                String value = scanner.nextLine().trim();
                if(value.isEmpty()) throw new InvalidDataException
                        ("CourseId must not be blank!");
                Course course = manager.findCourseById(value);
                if(course == null) throw new CourseNotFoundException
                        ("Could not find course: " + value);
                return course;
            } catch (CourseNotFoundException | InvalidDataException e){
                System.out.println(e.getMessage());
            }
            System.out.print("Enter again: ");
        }
    }

    public static Student findStudent(String prompt){
        System.out.print(prompt);
        while(true){
            try {
                String value = scanner.nextLine().trim();
                if(value.isEmpty()) throw new InvalidDataException
                        ("CourseId must not be blank!");
                Student student = manager.findStudentById(value);
                if(student == null) throw new CourseNotFoundException
                        ("Could not find course: " + value);
                return student;
            } catch (CourseNotFoundException | InvalidDataException e){
                System.out.println(e.getMessage());
            }
            System.out.print("Enter again: ");
        }
    }


}
