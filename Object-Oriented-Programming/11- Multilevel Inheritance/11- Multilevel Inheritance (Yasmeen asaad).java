//Author: Yasmeen asaad


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}

class Employee extends Person {
    private int employeeID;
    private String department;

    public Employee(int employeeID, String department, String name, int age) {
        super(name, age);
        this.employeeID = employeeID;
        this.department = department;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeID + "\nDepartment: " + department);
    }

    public void showDepartment() {
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    private int numTeams;

    public Manager(int numTeams, int employeeID, String department, String name, int age) {
        super(employeeID, department, name, age);
        this.numTeams = numTeams;
    }

    public void setNumTeams(int numTeams) {
        this.numTeams = numTeams;
    }

    public int getNumTeams() {
        return numTeams;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Teams: " + numTeams);
    }

    public void showTeams() {
        System.out.println("Number of Teams: " + numTeams);
    }
}

class Engineer extends Employee {
    private String specialization;

    public Engineer(String specialization, int employeeID, String department, String name, int age) {
        super(employeeID, department, name, age);
        this.specialization = specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
      
    }

    public void showSpecialization() {
        System.out.println("Specialization: " + specialization);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager M = new Manager(4, 213456, "Management", "Ahmed", 30);
        Engineer E = new Engineer("Design", 213322, "Engineering", "Ali", 32);
        
        M.displayInfo();
        M.showTeams();
        
        E.displayInfo();
        E.showSpecialization();
    }
}
