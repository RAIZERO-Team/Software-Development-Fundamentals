//Author: Mahmoud Hazem

package org.example;

import java.util.Scanner;

class Date{
    private int day;
    private int month;
    private int year;

    Date(int day , int month , int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    void setDay(int day){
        this.day = day;
    }

    void setMonth(int month){
        this.month = month;
    }

    void setYear(int year){
        this.year = year;
    }

    int getDay(){
        return day;
    }

    int getMonth(){
        return month;
    }

    int getYear(){
        return year;
    }

    long substractDate(Date d){
        long difference;
        difference = ((year * 365) + (month * 30) + day) - ((d.year * 365) + (d.month * 30) + d.day);
        if (difference < 0){
            difference *= -1;
        }
        return difference;
    }

    void printDate(){
        System.out.println(day + "/" + month + "/" + year);
    }
}

public class Main {

    public static void main(String[] args) {

        Date D1 = new Date(15 , 6 , 2004),
             D2 = new Date(2 , 7 , 2024);
        D1.substractDate(D2);
        D1.printDate();
        System.out.println(D1.substractDate(D2));
    }
}
