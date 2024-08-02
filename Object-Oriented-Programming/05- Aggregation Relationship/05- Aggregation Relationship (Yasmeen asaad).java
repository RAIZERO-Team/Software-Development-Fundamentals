//Author : Yasmeen asaad
package university;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yasmeen asaad
 */
public class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dep) {
        departments.add(dep);
    }

    public void displayList() {
        System.out.println("University: " + name);
        for (int i = 0; i < departments.size(); i++) {
            Department department = departments.get(i);
            System.out.println("Department Name: " + department.getDepartmentName());
            System.out.println("Location: " + department.getLocation());
            System.out.println("Head of Department: " + department.getHeadOfDepartment());
       
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        University uni1 = new University("EELU");
      Department dep1 = new Department("IT" , "sohag" ,"Kamal Hamza");
      Department dep2 = new Department("Ai" , "Asiut" ,"Kamal Hamza");
      uni1.addDepartment(dep1);
      uni1.addDepartment(dep2);
      uni1.displayList();
       
    }
}

class Department {
    private String departmentName;
    private String location;
    private String headOfDepartment;

    public Department(String departmentName, String location, String headOfDepartment) {
        this.departmentName = departmentName;
        this.location = location;
        this.headOfDepartment = headOfDepartment;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setHeadOfDepartment(String headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getLocation() {
        return location;
    }

    public String getHeadOfDepartment() {
        return headOfDepartment;
    }
}
