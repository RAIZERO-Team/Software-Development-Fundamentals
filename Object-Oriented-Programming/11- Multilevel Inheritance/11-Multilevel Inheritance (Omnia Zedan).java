//Author : omnia zedan
public class Person {
private String name;
private int age;
Person(String name,int age){
    this.age=age;
    this.name=name;
}

public void displayInfo(){
    System.out.println("name : "+this.name);
    System.out.println("age : "+this.age);
    
}

    public static void main(String[] args) {
        // TODO code application logic here
        Manager m=new Manager("mostafa",30,10234,"Software Development",10);
        m.displayInfo();
        m.showTeams();
        System.out.println("----------------");
        Engineer e=new Engineer("Ali",29, 10567,"Quality Assurance","Automated Testing");
        e.displayInfo();
        e.showSpecialization();
    }
    
}
class Employee extends Person{
  private int employeeID;  
  private String department;
  Employee(String name,int age,int employeeID,String department ){
      super(name,age);
      this.employeeID=employeeID;
      this.department=department;
  } 
  public void displayInfo(){
      super.displayInfo();
      System.out.println("employeeID : "+this.employeeID);
      System.out.println("department : "+this.department);
  }
  public void showDepartment(){
      System.out.println("department : "+this.department);
  }
  
}
class Manager extends Employee{
    private int numTeam;
    Manager(String name,int age,int employeeID,String department,int numTeam){
        super(name,age,employeeID,department);
        this.numTeam=numTeam;
        
    }
    public void setNumTeams(int numTeam) {
        this.numTeam = numTeam;
    }

    public int getNumTeams() {
        return numTeam;
    }
    public void displayInfo(){
        super.displayInfo();
      
    }
    public void showTeams() {
        System.out.println("number of team : " + numTeam);
    }
}
class Engineer extends Employee{
    private String specialization;

     Engineer(String name,int age,int employeeID,String department,String specialization ){
        super(name ,age,employeeID,department);
        this.specialization=specialization;
    }
     public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }
    public void displayInfo() {
        super.displayInfo(); 
        
    }
    public void showSpecialization(){
         System.out.println("Specialization : "+this.specialization);
     }
    
}