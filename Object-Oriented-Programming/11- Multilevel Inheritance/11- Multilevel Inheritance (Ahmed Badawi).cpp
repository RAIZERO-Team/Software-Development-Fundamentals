#include <iostream>
using namespace std;

class Person {
protected:
  string name;
  int age;

public:
  Person(){
    this -> name = "";
    this -> age = 0;
  }

  Person(string name, int age){
    this -> name = name;
    this -> age = age;
  }

  string getName() const {
    return name;
  }

  void setName(string name) {
    this -> name = name;
  }

  int getAge() const {
    return age;
  }

  void setAge(int age) {
    this -> age = age;
  }

  virtual void displayInfo(){
    cout<< "Name: " << name << "\n"
        << "Age: " << age << "\n";
  }
};

class Employee : public Person {
protected:
  int employeeID;
  string department;

  void displayInfo(){
    Person::displayInfo();
    cout<< "Employee ID: " << employeeID << "\n";
  }

  void showDepartment(){
    cout<< "Department: " << department << "\n";
  }

public:
  Employee(){
    employeeID = 0;
    department = "";
  }

  Employee(string name, int age, int employeeID, string department){
    Person::setName(name);
    Person::setAge(age);
    this -> employeeID = employeeID;
    this -> department = department;
  }

  int getEmployeeID() const {
    return employeeID;
  }

  void setEmployeeID(int employeeID) {
    this -> employeeID = employeeID;
  }

  string getDepartment() const {
    return department;
  }

  void setDepartment(string department) {
    this -> department = department;
  }
};

class Manager : public Person {
private:
  int numTeams;

public:
  Manager(){
    numTeams = 0;
  }

  Manager(string name, int age, int numTeams) {
    Person::setName(name);
    Person::setAge(age);
    this -> numTeams = numTeams;
  }

  int getNumTeams() const {
    return numTeams;
  }

  void setNumTeams(int numTeams) {
    this -> numTeams = numTeams;
  }

  void displayInfo(){
    Person::displayInfo();
    cout<< "Num teams: " << numTeams << "\n";
  }

  void showTeams(){
    cout<< "Teams: " << numTeams << "\n";
  }
};

class Engineer : public Employee {
private:
  string specialization;

public:
  Engineer(){
    specialization = "";
  }

  Engineer(string name, int age, int employeeID, string department, string specialization){
    // Employee(name, age, employeeID, department);
    Employee::setName(name);
    Employee::setAge(age);
    Employee::setEmployeeID(employeeID);
    Employee::setDepartment(department);
    this -> specialization = specialization;
  }

  void displayInfo(){
    Employee::displayInfo();
    cout<< "Specialization: " << specialization << "\n";
  }

  void showSpecialization(){
    cout<< "Specialization: " << specialization << "\n";
  }
};

int main(){
  Manager manager1("Ahmed" , 20, 2);
  Engineer engineer1("Mohamed", 20, 12345, "IT", "UX/UI");

  manager1.displayInfo();
  engineer1.displayInfo();
  return 0;
}