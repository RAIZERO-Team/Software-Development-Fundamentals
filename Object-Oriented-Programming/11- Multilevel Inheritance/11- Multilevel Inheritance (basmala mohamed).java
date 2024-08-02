//Author: basmala mohamed

class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int employeeID;
    String department;
    
    public Employee(String name, int age, int employeeID, String department) {
        super(name, age);
        this.employeeID = employeeID;
        this.department = department;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("ID: " + employeeID);
        System.out.println("Department: " + department);
    }
    
    public void showDepartment() {
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int numTeams;
    
    public Manager(String name, int age, int employeeID, String department, int numTeams) {
        super(name, age, employeeID, department);
        this.numTeams = numTeams;
    }
    
    public void setNumTeams(int numTeams) {
        this.numTeams = numTeams;
    }

    public int getNumTeams() {
        return numTeams;
    }
    
    public void showTeams() {
        System.out.println("Number of Teams: " + numTeams);
    }
}

class Engineer extends Employee {
    String specialization;
    
    public Engineer(String name, int age, int employeeID, String department, String specialization) {
        super(name, age, employeeID, department);
        this.specialization = specialization;
    }
    
    public void showSpecialization() {
        System.out.println("Specialization: " + specialization);
    }
}

public class OOP {
    public static void main(String[] args) {
        Manager m = new Manager("Basmala Mohamed", 30 , 12345 , "Manager" , 5);        
        Engineer e = new Engineer("Sama Mohamed", 20 , 123 , "Engineer" , "Software Engineer");
        
        System.out.println("Manager");
        m.displayInfo();
        m.showTeams();
        System.out.println("Engineer");
        e.displayInfo();
        e.showSpecialization();
    }
}