// Author: Reem Ezzat

#include <iostream>

using namespace std;
 class Person{

string name;
int age;

public:Person(string Name,int Age){
name=Name;
age=Age;
}
 void setName(string Name) {

    name=Name;

     }

     string GetName(){

      return name;

         }
         void setAge(int Age) {

    age=Age;

     }

     int GetAge(){

      return age;

         }
void displayPersonInfo(){
cout<<"Name: "<<this->name<<"\nAge: "<<this->age<<endl;
}



};
class Worker{

int workerID;
string role;
public: Worker(int WorkerID,string Role){
workerID=WorkerID;
role=Role;

}
   void setId(int WorkerID) {

    workerID=WorkerID;

     }

   int GetId(){

     return workerID;

   }
   void setRole(string Role) {

    role=Role;

     }

     string GetRole(){

      return role;

         }

   void displayWorkerInfo(){
   cout<<"ID: "<<this->workerID<<"\nRole: "<<this->role<<endl;


   }



};
class Employee: public Person,public Worker{
int employeeID;
string department;
public: Employee(string Name,int Age,int WorkerID,string Role,int EmployeeID,string Department):Person(Name,Age),Worker(WorkerID,Role){
employeeID=EmployeeID;
department=Department;

}
void setEmployeeID(int EmployeeID) {

    employeeID=EmployeeID;

     }

     int GetEmployeeId(){

      return employeeID;

         }

    void setDepartment(string Department) {

    department=Department;

           }

     string GetDepartment(){

      return department;

         }
void displayInfo(){
Person::displayPersonInfo();
Worker::displayWorkerInfo();
cout<<"Employee ID: "<<this->employeeID<<endl;
cout<<"Department : "<<this->department<<endl;

 }


};
class Manager:public Employee{

int numTeams;
public: Manager(string Name,int Age,int WorkerID,string Role,int EmployeeID,string Department,int NumTeams):Employee(Name,Age,WorkerID,Role,EmployeeID,Department){

numTeams=NumTeams;
}
void setNumTeams(int NumTeams) {

    numTeams=NumTeams;

     }

  int getNumTeams(){

  return numTeams;

}

 displayInfo(){
       Employee::displayInfo();
       cout<<"Type: Manager"<<endl;

    }
 void showTeams(){
     cout<<"Num Of Teams Managed: "<<this->numTeams<<endl;

    }


};
class Engineer:public Employee{
string specialization;

 public: Engineer(string Name,int Age,int WorkerID,string Role,int EmployeeID,string Department,string Specialization):Employee(Name,Age,WorkerID,Role,EmployeeID,Department){
specialization=Specialization;}

 void setSpecialization(string Specialization) {

    specialization=Specialization;

     }

     string getSpecialization(){

      return specialization;

         }
  displayInfo(){
    Employee::displayInfo();
    cout<<"Type: Engineer"<<endl;

         }

   void showSpecialization(){
   cout<<"Specialization: "<<this->specialization<<endl;
      }

};

int main()
{
    cout << "Details Of Workers" << endl;
    Manager m("Youssef Mohammed",22,64455,"sales manager",12,"financial",5);
    m.displayInfo();
    m.showTeams();
    cout<<"-----------------"<<endl;
    Engineer E("Osama Elsayed",35,47883,"Head",44,"CES","Civil Engineer");
    E.displayInfo();
    E.showSpecialization();
    return 0;
}
