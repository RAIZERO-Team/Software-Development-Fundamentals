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
    Person(string name, int age)
    {
        this->name=name;
        this->age=age;
    }
    void displayPersonInfo()
    {
        cout<<"Your name is : "<<name<<endl;
        cout<<"Your age is  : "<<age<<endl;
    }
};
class Worker
{
private:
    int workerID;
    string role;
public:
    Worker(int workerID,string role)
    {
        this->workerID=workerID;
        this->role=role;
    }
    void displayWorkerInfo()
    {
        cout<<"Your ID is : "<<workerID<<endl;
        cout<<"Your Role is "<<role<<endl;
    }
};
 class Employee :public Person,public Worker
 {
 private:
     int employeeID;
     string department;
 public:
    Employee(int employeeID, string department,string name, int age,int workerID,string role):Person(name,age),Worker(workerID,role)
    {
        this->employeeID=employeeID;
        this->department=department;
    }
    void showDepartment()
    {
        cout<<"Your Department is :"<<endl;
    }
    void displayInfo()
    {
        Person::displayPersonInfo();
        Worker::displayWorkerInfo();
       cout<<"Your Department is :"<<endl;
       cout<<"Your ID is : "<<employeeID<<endl;
    }
 };
 class Manager :public Employee
 {
 private:
    int numTeams;
 public:
    Manager(int numTeams,int employeeID, string department,string name, int age,int workerID,string role):Employee(employeeID,department,name,age,workerID,role)
    {
        this->numTeams=numTeams;
    }
    void showTeams()
    {
        cout<<"Number Of Teams is : "<<numTeams<<endl;
    }
    void displayInfo()
    {
       Employee::displayInfo();
       cout<<"Number Of Teams is : "<<numTeams<<endl;
    }
 };
 class Engineer :public Employee
 {
 private:
    string specialization ;
 public:
     Engineer(string specialization,int numTeams,int employeeID, string department,string name, int age,int workerID,string role):Employee(employeeID,department,name,age,workerID,role)
     {
         this->specialization=specialization;
     }
      void showSpecialization()
    {
       cout<<"The specialization is : "<<specialization<<endl;
    }
     void displayInfo()
    {
        Employee::displayInfo();
        cout<<"The specialization is : "<<specialization<<endl;
    }
 };
int main()
{
    cout<<"Info Of Manager "<<endl;
    Manager M(4,22202,"IT","Abdalla",20,25," Analyzing");
    M.displayInfo();
    cout<<"_________________________________"<<endl;
    cout<<"Info Of Engineer "<<endl;
    Engineer E("AI",5,2202,"CS","Abdalla",20,25," Analyzing");
    E.displayInfo();


       return 0;

}
