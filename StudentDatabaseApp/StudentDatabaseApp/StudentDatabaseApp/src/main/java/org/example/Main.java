package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numberOfNewStudents = 0;
        String newStudentName = "";
        int newStudentYear = 0;
        HashMap<String, Student> students = new HashMap<>();

        System.out.println("Number of students to add?: ");
        numberOfNewStudents = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numberOfNewStudents; i ++){
            System.out.println("Enter the name of student ");
            newStudentName = input.nextLine();
            System.out.println("Enter the year of student ");
            newStudentYear = input.nextInt();
            input.nextLine();
            students.putIfAbsent(newStudentName, new Student(newStudentName, newStudentYear));
        }

        System.out.println("Would you like to add new courses?: (y/n)");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("y")){

                System.out.println("Enter the student name to add courses to: ");
                String studentToAddCourse = input.nextLine();
                System.out.print("Enter course name: ");
                String courseToAdd = input.nextLine();
                students.get(studentToAddCourse).addCourses(courseToAdd);
                System.out.println(students.get(studentToAddCourse).getBalance());
                students.get(studentToAddCourse).getStudentCourses();
        }
    }
}