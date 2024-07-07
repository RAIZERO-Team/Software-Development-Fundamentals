//Author: Shahd Mahmoud
package taskoop5;

//import java.util.List;
import java.util.*;

public class Taskoop5 {

    public static void main(String[] args) {
        University u1 = new University("EELU");
        Department d1 = new Department("IT", "Sohag", "En/Abdelrahman");
        u1.addDepartment(d1);
        u1.printDetails();
    }

}

class University {

    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<Department>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void printDetails() {

        for (int i = 0; i < departments.size(); i++) {
System.out.println("name of department: " + departments.get(i).departmentName + "\n" + "Location of department: " + departments.get(i).location
                    
            + "\n" + "Head Of Department : " + departments.get(i).headOfDepartment);

        }
    }

}

class Department {

    public String departmentName;
    public String location;
    public String headOfDepartment;

    public Department(String departmentName, String location, String headOfDepartment) {
        this.departmentName = departmentName;
        this.location = location;
        this.headOfDepartment = headOfDepartment;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(String headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

}
