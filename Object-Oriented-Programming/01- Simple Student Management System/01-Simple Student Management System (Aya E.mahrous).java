//Author: Aya E.mahrous


package javaapplication12;

/**
 *
 * @author CS
 */
public class Student {
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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }
   public void printDetails(){
       System.out.println(name);
       System.out.println(age);
       System.out.println(grade);
   }
   
   
}



public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("Aya",100,11.9);
        s1.setName("Ahmed");
        s1.setAge(20);
        s1.setGrade(50.6);
        s1.getName();
        s1.getAge();
        s1.getGrade();
        s1.printDetails();
        s2.printDetails();
        
    }
    
}