//Author: Yasmeen asaad
package student;

/**
 *
 * @author yasmeen asaad
 */
public class Student {

    
     private String name ;
     private int age;
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

     
  
   
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("yasmeen",15,5.5);
        
        s1.name="Ali";
        s1.age=17;
        s1.grade=3.5;
     s1.printDetails();
     s2.printDetails();
      
    }
    
}
