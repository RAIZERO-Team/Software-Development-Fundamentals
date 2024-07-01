//Author: Shahd Mahmoud

package taskoop1;
public class Taskoop1 {
    
    public static void main(String[] args) {
        Student s1= new Student();
        Student s2=new Student();
        s1.setName("Aya Ali");
        s1.setAge(20);
        s1.setGrade(3.73);
        s2.setName("Esraa Khaled");
        s2.setAge(21);
        s2.setGrade(3.45);
        s1.printdetails();
        s2.printdetails();
    }
    
}
 class Student{
   private String name;
   private int age;
   private double grade;
   
 public Student(){
     name="";
     age =0;
     grade =0.0;
 }

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }
    public void printdetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
         System.out.println("Grade: "+grade);
    }
   
}