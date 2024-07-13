#include <iostream>
#include<algorithm>
#include<string>
#include<math.h>
using namespace std;
 class Person
 {
 private:
     string name;
     int age;
 public:
    Person(string name,int age)
    {
        this->name=name;
        this->age=age;
    }
    void displayInfo()
    {
        cout<<"The name is : "<<name<<endl;
        cout<<"The age is : "<<age<<endl;
    }
 };
 class Employee : public Person
 {
 private:
    int employeeID;
    string department;
 public:
    Employee(string name,int age,int employeeID,string department):Person(name,age)
    {
        this->employeeID=employeeID;
        this->department=department;
    }
    void displayInfo()
    {
        Person::displayInfo();
        cout<<"The employee ID is : "<<employeeID<<endl;
        cout<<"this Employee work in department : "<<department<<endl;
    }
    void showDepartment()
    {
        cout<<"Employee work in department : "<<department<<endl;
    }
 };
 class Manager:public Employee
 {
 private:
     int numTeams;
 public:
     Manager(string name,int age,int employeeID,string department,int numTeams):Employee(name,age,employeeID,department)
     {
       this->numTeams=numTeams;
     }
      void displayInfo()
    {
        Employee::displayInfo();
        cout<<"The number of Teams : "<<numTeams<<endl;
    }
    void showTeams()
    {
      cout<<"The number of Teams : "<<numTeams<<endl;
    }
 };
 class Engineer :public Employee
 {
 private:
    string specialization ;
 public:
     Engineer(string name,int age,int employeeID,string department,string specialization):Employee(name,age,employeeID,department)
     {
         this->specialization=specialization;
     }
     void displayInfo()
    {
        Employee::displayInfo();
        cout<<"The specialization is : "<<specialization<<endl;
    }
    void showSpecialization()
    {
       cout<<"The specialization is : "<<specialization<<endl;
    }

 };
int main()
{
    cout<<"The info of Manager"<<endl;
    Manager M("Abdalla",20,220022,"AI",5);
    M.displayInfo();
    cout<<"_________________________________________"<<endl;
    cout<<"The info Engineer"<<endl;
    Engineer E("Abdalla",20,202200,"ML","AI");
    E.displayInfo();

}
