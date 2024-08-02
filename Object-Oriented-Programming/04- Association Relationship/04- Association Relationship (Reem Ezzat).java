// Author : Reem Ezzat

import java.util.ArrayList;


public class SW_Development_Fundamentals {

    
    public static void main(String[] args) {
        
        Student Ahmed=new Student("Ahmed",15,72662);
        Student Salma=new Student("Salma", 20, 45537);
        Course math=new Course ("math",5);
        Course AI=new Course ("AI",7);
        Course DS=new Course ("DS",10);
        Course science=new Course ("science",12);
        
        Ahmed.enroll(math);
        Ahmed.enroll(AI);
        Ahmed.showCourses();
        
        Salma.enroll(DS);
        Salma.enroll(science);
        Salma.enroll(math);
        Salma.showCourses();
        
} }
  class Student{
  
  private String name;
  private int    age;
  private int roll_number;
  
  Student(String name,int age,int roll_number){
  this.name=name;
  this.age=age;
  this.roll_number=roll_number;
  
  }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRoll_number(int roll_number) {
        this.roll_number = roll_number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRoll_number() {
        return roll_number;
    }
    
    // I used arrayList because I don't know the max number of courses each Student can be Enrolled in
    ArrayList<String> courses = new ArrayList<String>();

   void enroll (Course c){
     String courseData= "Course: "+c.CourseName+"    duration:   "+Integer.toString(c.durationInWeeks)+" Weeks";
     courses.add(courseData);
   }
   
  void showCourses(){
            System.out.println("Enrolled courses : \n");

      for(int j=0;j<courses.size();j++){
          System.out.println(""+courses.get(j));
      }
  }
  
  
  
  
  }
class Course{
String CourseName;
int durationInWeeks;

Course(String CourseName,int durationInWeeks){
this.CourseName=CourseName;
this.durationInWeeks=durationInWeeks;
    
}

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public void setDurationInWeeks(int durationInWeeks) {
        this.durationInWeeks = durationInWeeks;
    }

    public String getCourseName() {
        return CourseName;
    }

    public int getDurationInWeeks() {
        return durationInWeeks;
    }


}