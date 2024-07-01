//Author: Shahd Mahmoud
package task3oop;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Task3oop {

    public static void main(String[] args) {
        Date d1 = new Date(20, 6, 2018);
        Date d2 = new Date(21, 7, 2019);
//System.out.println("Date 1:");
        d1.printDate();
        //System.out.println("Data 2: "+"");
        d2.printDate();

        System.out.println("Difference between these two dates in days: " + d1.subtract(d2));
    }
}

class Date {

    int day;
    int month;
    int year;
    private LocalDate date;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.date = LocalDate.of(year, month, day);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 1 && day <= 31) {
            this.day = day;
            this.date = LocalDate.of(this.year, this.month, this.day);
        } else {
            System.out.println("Sorry, this is impossible");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month <= 12) {
            this.month = month;
            this.date = LocalDate.of(this.year, this.month, this.day);
        } else {
            System.out.println("Sorry, this is impossible");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
        this.date = LocalDate.of(this.year, this.month, this.day);
    }

    public int subtract(Date d) {
        LocalDate d1 = LocalDate.of(this.year, this.month, this.day);
        LocalDate d2 = LocalDate.of(d.getYear(), d.getMonth(), d.getDay());
        return (int) ChronoUnit.DAYS.between(d1, d2);
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void printDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);

    }
}
