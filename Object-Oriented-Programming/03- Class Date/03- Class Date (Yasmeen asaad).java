//Author :Yasmeen asaad
package date;

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

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int subtractDate(Date d) {
        LocalDate date1 = LocalDate.of(year, month, day);
        LocalDate date2 = LocalDate.of(d.getYear(), d.getMonth(), d.getDay());
        return (int) ChronoUnit.DAYS.between(date1, date2);
    }

    public void printDate() {
        System.out.println(day + "/" + month + "/" + year);
    }

    public static void main(String[] args) {
        Date d1 = new Date(20, 6, 2018);
        Date d2 = new Date(21, 7, 2019);

        d1.printDate();
        d2.printDate();

        int diff = d1.subtractDate(d2);
        
    }
}

