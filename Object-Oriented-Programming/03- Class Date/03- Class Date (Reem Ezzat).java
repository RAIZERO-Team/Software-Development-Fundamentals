// Author : Reem Ezzat

public class SW_Development_Fundamentals {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Date d1 =new Date(20,6,2018);
        Date d2=new Date(21,7,2019);
        System.out.println("first date: ");
       d1.printDate();
        System.out.println("second date: ");
        d2.printDate();
        
        System.out.println("Subtraction Result in days: "+d2.subtractDate(d1));
        
        
        
} }
  class Date{
 int day;
 int month;
int year;

    
     Date(int day,int month,int year){
     this.day=day;
     this.month=month;
      this.year=year;

     }

    public void setDay(int day) {
        if(day>0&&day<=31)
        this.day = day;
    }

    public void setMonth(int month) {
        if(month>0&&month<=12)
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
public int subtractDate(Date d){
 int diff_day=day-d.day;
 int diff_month=(month-d.month)*30;
 int diff_year= (year-d.year)*365;
 int difference_in_days=diff_day+diff_month+diff_year;
 
return difference_in_days;
}
public void printDate(){
    System.out.println(day+"/"+month+"/"+year);

}
   
    }