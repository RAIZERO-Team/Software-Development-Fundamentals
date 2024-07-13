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

int getId(){

return workerID;

   }
 void setRole(string Role) {

  role=Role;

  }

 string getRole(){

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
class Contractor:public Person,public Worker{

int contractDuration;
string project;
public: Contractor(string Name,int Age,int WorkerID,string Role,int ContractDuration,string Project):Person(Name,Age),Worker(WorkerID,Role){
contractDuration=ContractDuration;
project=Project;
}
void setContractDuration(int ContractDuration) {

contractDuration=ContractDuration;

}

int getContractDuration(){

return contractDuration;

}

void setProject(string Project) {

project=Project;

}

string getProject(){

return project;

}

void showProject(){
 cout<<"Project: "<<this->project<<endl;

 }


displayInfo(){
Person::displayPersonInfo();
Worker::displayWorkerInfo();

cout<<"Contract Duration: "<<this->contractDuration<<" month"<<endl;
showProject();

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
cout<<"Type: Manager"<<endl;
Employee::displayInfo();
showTeams();
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
     cout<<"Type: Engineer"<<endl;
    Employee::displayInfo();
    showSpecialization();

  }

 void showSpecialization(){
cout<<"Specialization: "<<this->specialization<<endl;
}

};
class Freelancer:public Contractor{
double hourlyRate;
public: Freelancer(string Name,int Age,int WorkerID,string Role,int ContractDuration,string Project,double HourlyRate):Contractor( Name, Age, WorkerID, Role, ContractDuration, Project){

hourlyRate=HourlyRate;
}

void setHourlyRate(int HourlyRate) {

    hourlyRate=HourlyRate;

}

int getHourlyRate(){

  return hourlyRate;

}
displayInfo(){
cout<<"Type: Freelancer"<<endl;
Contractor::displayInfo();
showHourlyRate();

}
void showHourlyRate(){
cout<<"Hourly Rate: "<<this->hourlyRate<<" $"<<endl;

}


};


int main()
{
    cout << "Details Of Workers" << endl;
    Manager m("Youssef Mohammed",22,64455,"sales manager",12,"financial",5);
    m.displayInfo();

    cout<<"-----------------"<<endl;
    Engineer E("Osama Elsayed",35,47883,"Head",44,"CES","Civil Engineer");
    E.displayInfo();

    cout<<"-----------------"<<endl;
    Freelancer F("Eman Ahmed", 27,11002,"senior",14,"E-Commerce",25.6);
    F.displayInfo();

    return 0;
}
