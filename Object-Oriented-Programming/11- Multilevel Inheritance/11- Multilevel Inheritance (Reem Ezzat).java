// Author: Reem Ezzat


public class SW_Development_Fundamentals {
 

    public static void main(String[] args) {
        Manager Hussam=new Manager("Hussam Refaat",32,40032,"Sales",3);
        
        Engineer Eyad=new Engineer("Eyad Mustafa",28,11223,"Engineering","Electrical Engineering");
        
        Hussam.displayInfo();
        Hussam.showTeams();
        System.out.println("----------------");
        Eyad.displayInfo();
        Eyad.showSpecialization();
} }
class Person{
String name;
int age;

    public Person(String name,int age) {
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    void displayInfo(){
        System.out.println("Person Details: \nName: "+this.name+
                                           "\nAge:"+this.age);
    }

}
class Employee extends Person{
int employeeID;
String department;
    public Employee(String name,int age,int employeeID,String department) {
        super(name, age);
        this.employeeID=employeeID;
        this.department=department;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID : "+this.employeeID+
                          "\nDepartment : "+this.department);
    }
    
}

class Manager extends Employee{
int numTeams;
    public Manager(String name,int age,int employeeID,String department,int numTeams) {
        super(name, age, employeeID, department);
        this.numTeams=numTeams;
    }

    public void setNumTeams(int numTeams) {
        this.numTeams = numTeams;
    }

    public int getNumTeams() {
        return numTeams;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); 
        System.out.println("Type: Manager");
    }
    void showTeams(){
        System.out.println("Number Of Teams Managed: "+numTeams);
    }
       

}
class Engineer extends Employee{
String specialization;
    public Engineer(String name,int age,int employeeID,String department,String specialization) {
        super(name, age, employeeID, department);
        this.specialization=specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); 
        System.out.println("Type: Engineer");
    }
     void showSpecialization(){
         System.out.println("Specialization: "+this.specialization);
     }
    
}