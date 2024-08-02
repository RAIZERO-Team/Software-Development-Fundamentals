//Author:omnia zedan
class Departments {
   String departmentName;
 String location;
 String headOfDepartment;
 
public Departments(String departmentName,String location,String headOfDepartment){
this.departmentName=departmentName;
this.location=location;
this.headOfDepartment=headOfDepartment;

}
 
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setHeadOfDepartment(String headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getHeadOfDepartment() {
        return headOfDepartment;
    }

    public String getLocation() {
        return location;
    }
  
}

class University {
    private String name;
    private Departments[] departments;
    private int departmentCount;

    public University(String name, int maxDepartments) {
        this.name = name;
        this.departments = new Departments[maxDepartments];
        this.departmentCount = 0;
    }

    public void addDepartment(Departments depart) {
        if (departmentCount < departments.length) {
            departments[departmentCount] = depart;
            departmentCount++;
        } else {
            System.out.println("No more departments can be added.");
        }
    }

    public void detilsOfDepartment() {
        System.out.println("Departments in university:");
        for (int i = 0; i < departmentCount; i++) {
            if (departments[i] != null) {
                System.out.println("Department Name: " +departments[i].getDepartmentName());
                  System.out.println("Location: " + departments[i].getLocation());
                    System.out.println("Head of Department: " +departments[i].getHeadOfDepartment()
                    
                    
                    
                    );
            }
        }
    }

    public static void main(String[] args) {
       University university = new University("EELU", 10);
        university.addDepartment(new Departments("IT", "Sohag", " Dr/ Ali Mostafa "));
     
        university.detilsOfDepartment();
    }
}