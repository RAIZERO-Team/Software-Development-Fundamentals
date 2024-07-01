import java.util.Calendar;

/**
 *
 * @author 3M.T
 */
public class Date {
 private int day;
    private int month;
    private int year;

    
private boolean isValidDate(int day, int month, int year) {
        if (year < 1) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > 31) {
            return false;
        }
        return true;
    }
    public Date(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
           System.out.println("invalid date");
        }
    }

    public void setDay(int day) {
        if (isValidDate(day, this.month, this.year)) {
            this.day = day;
        } else {
            System.out.println("invalid day");
        }
    }

    public void setMonth(int month) {
        if (isValidDate(this.day, month, this.year)) {
            this.month = month;
        } else {
          System.out.println("invalid month");
        }
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
        Calendar c1 = Calendar.getInstance();
        c1.set(this.year, this.month - 1, this.day); // month is 0-based in Calendar
        Calendar c2 = Calendar.getInstance();
        c2.set(d.year, d.month - 1, d.day); // month is 0-based in Calendar

        long c3 = Math.abs(c1.getTimeInMillis() - c2.getTimeInMillis());
        return (int) (c3 / (1000 * 60 * 60 * 24));
    }

    public void printDate() {
        System.out.println(day + "/" + month + "/" + year);
    }

   

   

    

    public static void main(String[] args) {
        Date d1 = new Date(20, 6, 2018);
        Date d2 = new Date(21, 7, 2019);
        
        int d3 = d1.subtractDate(d2);
        System.out.println(" number of days between two dates: " + d3 + " day");
    }
}


