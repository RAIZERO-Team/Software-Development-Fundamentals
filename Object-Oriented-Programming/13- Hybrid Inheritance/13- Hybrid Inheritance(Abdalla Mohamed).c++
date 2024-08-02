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
        cout<<"Your Department is :"<<department<<endl;
    }
    void displayInfo()
    {
        Person::displayPersonInfo();
        Worker::displayWorkerInfo();
       cout<<"Your Department is :"<<department<<endl;
       cout<<"Your ID is : "<<employeeID<<endl;
    }
 };
 class Contractor:public Person,public Worker
 {
 private:
    int contractDuration;
    string project;
 public:
    Contractor(int contractDuration,string project,string name, int age,int workerID,string role):Person(name,age),Worker(workerID,role)
    {
        this->contractDuration=contractDuration;
        this->project=project;
    }
    void showProject()
    {
        cout<<"The Project is :"<<project<<endl;
    }
    void displayInfo()
    {
        Person::displayPersonInfo();
        Worker::displayWorkerInfo();
        cout<<"The Project is :"<<project<<endl;
        cout<<"The contractDuration is : "<<contractDuration<<" Years"<<endl;
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
 class Freelancer:public Contractor
 {
 private:
    int hourlyRate;
 public:
    Freelancer(int hourlyRate,int contractDuration,string project,string name, int age,int workerID,string role):Contractor(contractDuration,project,name,age,workerID,role)
    {
        this->hourlyRate=hourlyRate;
    }
    void showHourlyRate()
    {
        cout<<"Your work Hourly Rate is : "<<hourlyRate<<endl;
    }
    void displayInfo()
    {
        Contractor::displayInfo();
        cout<<"Your work Hourly Rate is : "<<hourlyRate<<" hour"<<endl;
    }

 };
int main()
{
    cout<<"Info Of Manager "<<endl;
    Manager M(5,220025,"AI","Abdalla",20,400,"Manger");
    M.displayInfo();
    cout<<"_________________________________"<<endl;
    cout<<"Info Of Engineer "<<endl;
    Engineer E("AI",5,200220,"CS","Abdalla",20,400,"Engineer");
    E.displayInfo();
    cout<<"_________________________________"<<endl;
    cout<<"Info Of Freelancer"<<endl;
    Freelancer F(15,2,"Stavitel","Abdalla",20,22250,"Freelancer");
    F.displayInfo();

       return 0;
}
