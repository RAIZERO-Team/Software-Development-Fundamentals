#include <iostream>
#include <vector>
using namespace std;

class Department
{
  string departmentName;
  string location;
  string headOfDepartment;

public:
  Department() : departmentName(""), location(""), headOfDepartment("") {}

  Department(string departmentName, string location, string headOfDepartment) : departmentName(departmentName), location(location), headOfDepartment(headOfDepartment) {}

  string getdepName(){
    return departmentName;
  }

  void setdepName(string departmentName){
    this->departmentName = departmentName;
  }

  string getlocation(){
    return location;
  }

  void setlocation(string location){
    this->location = location;
  }

  string getheadOfDepartment(){
    return headOfDepartment;
  }

  void setheadOfDepartment(string headOfDepartment){
    this->headOfDepartment = headOfDepartment;
  }

  void printDepartmentDetails(){
    cout << "Department Name: " << departmentName << "\n"
        << "Department Location: " << location << "\n"
        << "Head of Department: " << headOfDepartment<< "\n";
  }
};

class University {
  string universityName;
  vector<Department*> univerDept;

public:
  University() : universityName(""){}

  University(string universityName) : universityName(universityName){}

  void adddepartment(Department*department){
    univerDept.push_back(department);
  }

  void displaydepartment(){
    cout << "\n==========================\n";
    for (const auto& university_department : univerDept) {
        university_department->printDepartmentDetails();
    }
    cout << "==========================\n";
  }
};

int main()
{
  Department dept1("IT", "Room 1", "Dr.Ahmed Badawi");
  Department dept2("AI", "Lab 2", "Eng.Mohand");

  University univ1("EELU");

  univ1.adddepartment(&dept1);
  univ1.adddepartment(&dept2);

  univ1.displaydepartment();

  return 0;
}