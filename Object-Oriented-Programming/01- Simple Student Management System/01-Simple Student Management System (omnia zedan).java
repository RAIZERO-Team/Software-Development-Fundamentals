//Author: omnia zedan
public class Student {
private String name;
private int age;  
private double grade;
 public Student(){
 this.name ="";
 this.age=0;
 this.grade=0.0;
 }
 public Student(String name, int age,double grade){
     this.name=name;
     this.age=age;
     this.grade= grade;
 }
 public Student(String name, int age){
     this.age=age;
     this.name=name;
 }
 public void SetName(String name){
     this.name=name;
 }
 public void SetAge(int age){
     this.age=age;
 }
 public void SetGarde(double grade){
     this.grade=grade;
 }
 public String GetName(){
     return name;
 }
 public int GetAge(){
     return age;
 }
 public double GetGarde(){
     return grade;
 }
public void printDetails(){
  System.out.println("Name : " + name);
       System.out.println("Age: " + age);
       System.out.println("Grade : " + grade);  
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Student s=new Student();
      s.SetAge(21);
      s.SetName("omnia");
      s.SetGarde(9);
     s.printDetails();
       Student s2=new Student( "malak",20,8);
      s2.printDetails();
        
    }
    
}
