//Author: basmala mohamed

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Date {
    
    private int day;
    private int month;
    private int year;
    
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public int subtractDate(Date d) {
        LocalDate d1 = LocalDate.of(this.year, this.month, this.day);
        LocalDate d2 = LocalDate.of(d.getYear(), d.getMonth(), d.getDay());
        return (int) ChronoUnit.DAYS.between(d1, d2);
    }

    public void printDate() {
        System.out.println(day + "/" + month + "/" + year);
    }

    public static void main(String[] args) {
        Date d1 = new Date(20,6,2018);
        Date d2 = new Date(21,7,2019);
        int D = d1.subtractDate(d2);

        System.out.println("Date 1: ");
        d1.printDate();
        
        System.out.println("Date 2: ");
        d2.printDate();  

        System.out.println("Difference days: " + D);
    }
}