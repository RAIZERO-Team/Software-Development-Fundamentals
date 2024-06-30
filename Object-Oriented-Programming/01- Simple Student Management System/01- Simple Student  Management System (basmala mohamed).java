//Author: basmala mohamed

public class Student {
    
    private String name;
    private int age;

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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    private double grade;

    public Student() {
        this.name = "";
        this.age = 0;
        this.grade = 0.0;
    }

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 0.0;
    }
    
    public void printDetails(){
       System.out.println("Name of student: " + name);
       System.out.println("Age of student: " + age);
       System.out.println("Grade of student: " + grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
   
        s1.setName("basmala");
        s1.setAge(20);
        s1.setGrade(2.0);
        Student s2 = new Student("sama", 21, 1.5);

        System.out.println("Student 1");
        s1.printDetails();

        System.out.println("Student 2");
        s2.printDetails();
    }
}