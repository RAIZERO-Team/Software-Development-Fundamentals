// Author: Reem Ezzat
public class SW_Development_Fundamentals {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Student student1=new Student();
        student1.setName("Rahma Ahmed");
        student1.setAge(20);
        student1.setGrade(45.34);
        Student student2=new Student("Reem Ezzat", 20, 25.5);
         student1.PrintDatails();
         student2.PrintDatails();
        
    }
    
}
 class Student{
private String name;
private int age;
private  double grade;

     Student(){
     this.name="";
     this.age=0;
     this.grade=0.0;
         
     }
     Student(String name,int age,double grade){
     this.name=name;
     this.age=age;
     this.grade=grade;
     }
     Student(Student s ){
     this.name=name;
     this.age=age;
     
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
     public  void PrintDatails(){
         System.out.println("\n Student Data  ");
         System.out.println("Name : "+name);
         System.out.println("Age  : "+age);
         System.out.println("Grade : "+grade);
     }


}