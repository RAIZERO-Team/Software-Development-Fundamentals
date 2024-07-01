//Author: Mahmoud Hazem

package org.example;

import java.util.Scanner;

class Student{
    private String name;
    private int age;
    private double grade;

    Student(){
        this.name="";
        this.age=0;
        this.grade=0.0;
    }

    Student(String name , int age , double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    Student(String name , int age){
        this.name = name;
        this.age = age;
    }

    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }

    void setGrade(double grade){
        this.grade = grade;
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    double getGrade(){
        return grade;
    }

    void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class Main {

    public static void main(String[] args) {
        Student std1 = new Student("Mahmoud" , 20 , 9.9 );
        Student std2 = new Student();

        std2.setName("Sasa");
        std2.setAge(11);
        std2.setGrade(9.9);

        std1.printDetails();
        System.out.println();
        std2.printDetails();

    }
}
