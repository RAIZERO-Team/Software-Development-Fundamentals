//Author: yasmeen asaad

package student1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yasmeen asaad
 */
public class Student1 {

     private String name;
   private int age;
   private int rollNumbe;
private ArrayList<course> courses;

    public Student1(String name, int age, int rollNumbe) {
        this.name = name;
        this.age = age;
        this.rollNumbe = rollNumbe;
        this.courses = new ArrayList<>();
    }

    

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRollNumbe(int rollNumbe) {
        this.rollNumbe = rollNumbe;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRollNumbe() {
        return rollNumbe;
    }
    
    public void addcours(course Course){
        courses.add(Course);
    }
 public void listCourses() {
        
        for (int i = 0; i < courses.size(); i++) {
             course course = courses.get(i);
            System.out.println(course.getCourseName() + " (" + course.getDuration() + " hours per day)");
            
            
        }
 }
    
  public static class course{

       
        private String courseName;
        int duration;

        public course(String courseName, int duration) {
            this.courseName = courseName;
            this.duration = duration;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public String getCourseName() {
            return courseName;
        }

        public int getDuration() {
            return duration;
            
        }
        
    }
   
    public static void main(String[] args) {
        Student1 S1 = new Student1("Ali" , 15 , 12345);
        course c1= new course("English", 3);
        course c2= new course("Frensh", 5);
         
         S1.addcours(c1);
         S1.addcours(c2);
         S1.listCourses();
        
    }
    
}
