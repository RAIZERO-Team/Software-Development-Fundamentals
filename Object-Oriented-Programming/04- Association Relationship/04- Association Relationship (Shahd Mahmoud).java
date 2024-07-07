//Author: Shahd Mahmoud

package taskoop4;

import java.util.ArrayList;


public class Taskoop4 {

    
    public static void main(String[] args) {
         Student shahd=new Student("shahd",21,12354);
        Student aya=new Student("aya", 19, 87659);
        Course math=new Course ("math",6);
        Course Sw=new Course ("Sw",9);
        Course OOP=new Course ("OOP",10);
        Course Db=new Course ("Db",7);
        
        shahd.enroll(math);
        shahd.enroll(Sw);
        shahd.showCourses();
        
        aya.enroll(OOP);
        aya.enroll(Db);
        aya.enroll(Sw);
        aya.showCourses();
        
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
