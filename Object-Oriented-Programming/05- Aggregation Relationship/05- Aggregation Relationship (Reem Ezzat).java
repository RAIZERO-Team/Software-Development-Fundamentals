// Author: Reem Ezzat

import java.util.ArrayList;


public class SW_Development_Fundamentals {

    
    public static void main(String[] args) {
        
         University EELU= new University("EELU");
        Department IT=new Department("IT", "Giza_Dokki", "Dr.KAmal Hamza");
        Department Business_Administration=new Department("Business_Administration","Giza_Dokki","Dr. Hisham");
        
        EELU.add_department(IT);
        EELU.add_department(Business_Administration);
        EELU.printDetails();
        
} }
 class University{

String name;
  ArrayList<Department> departments = new ArrayList<Department>();

     University(String name) {
         this.name=name;
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

  void add_department(Department d){
  
      departments.add(d);
  }

void printDetails(){
    System.out.println(" << Details Of Departments >> \n");
for(int j=0;j<departments.size();j++){
          System.out.println(" Department name: "+departments.get(j).departmentName+
                              "\n Department Location: "+departments.get(j).location+
                              "\n Head Of Department : "+departments.get(j).headOfDepartment
          
          
          );
      }
}



}
class Department {
 String departmentName;
 String location;
 String headOfDepartment;
 
Department(String departmentName,String location,String headPfDepartment){
this.departmentName=departmentName;
this.location=location;
this.headOfDepartment=headPfDepartment;

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