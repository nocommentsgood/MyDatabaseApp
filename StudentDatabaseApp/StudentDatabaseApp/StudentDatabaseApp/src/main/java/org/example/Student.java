package org.example;

import java.util.ArrayList;
import java.util.UUID;

public class Student {
    private String studentName = "";
    private int studentYear = 0;
    private String studentID = "";
    private final ArrayList<String> studentCourses = new ArrayList<>();
    private int balance = 0;

    public Student(String studentName, int studentYear) {
        this.studentName = studentName;
        this.studentYear = studentYear;
        this.studentID = setStudentID(studentYear);
    }

    /*
    Use the year of the student to generate the first digit of the student ID
    Use UUID to randomly generate the rest of the ID, then trim it to the requirement of length 5
     */
    private String setStudentID(int studentYear) {
        String uniqueID = UUID.randomUUID().toString();
        StringBuilder uniqueIDx = new StringBuilder(uniqueID);
        uniqueIDx.insert(0, studentYear);
        uniqueIDx.delete(5, uniqueIDx.length());
        return String.valueOf(uniqueIDx);
    }

    public void addCourses(String courseName) {
        if (courseName.equals("History 101") ||
                        courseName.equals("Mathematics 101") ||
                        courseName.equals("English 101") ||
                        courseName.equals("Chemistry 101") ||
                        courseName.equals("Computer Science 101"))
        {
            studentCourses.add(courseName);
            balance += 600;
        }
    }

    public void getStudentCourses() {
        System.out.println(studentCourses.toString());
    }

    public void setStudentYear(int studentYear) {
        this.studentYear = studentYear;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentYear() {
        return studentYear;
    }

    public int getBalance() {
        return balance;
    }

    public int payBalance(int amountToPay){
        balance -= amountToPay;
        return balance;
    }
}


