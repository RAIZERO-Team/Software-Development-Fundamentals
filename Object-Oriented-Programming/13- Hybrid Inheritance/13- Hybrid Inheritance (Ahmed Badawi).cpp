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

  virtual void displayPersonInfo(){
    cout<< "Name: " << name << "\n"
        << "Age: " << age << "\n";
  }
};

class Worker {
protected:
  int workerID;
  string role;

  Worker(){
    workerID = 0;
    role = "";
  }

  Worker(int workerID, string role){
    this -> workerID = workerID;
    this -> role = role;
  }
  
  int getWorkerID() const {
    return workerID;
  }

  void setWorkerID(int workerID) {
    this -> workerID = workerID;
  }

  string getRole() const {
    return role;
  }

  void setRole(string role) {
    this -> role = role;
  }

  void displayWorkerInfo(){
    cout<< "Worker ID: " << workerID << "\n"
        << "Role: " << role << "\n";
  }
};

class Employee : public Person , public Worker {
private:
  int employeeID;
  string department;

public:
  Employee(){
    employeeID = 0;
    department = "";
  }

  void setEmployeeData(string name , int age,int workerID, string role, int employeeID, string department){
    Person::setName(name);
    Person::setAge(age);
    Worker::setWorkerID(workerID);
    Worker::setRole(role);
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

  void displayPersonInfo(){
    Person::displayPersonInfo();
    cout<< "Employee ID: " << employeeID << "\n"
        << "Department: " << department << "\n";
  }

  void displayWorkerInfo(){
    Worker::displayWorkerInfo();
    cout<< "Employee ID: " << employeeID << "\n"
        << "Department: " << department << "\n";
  }

  void showDepartment(){
    cout<< "Department: " << department << "\n";
  }

  void displayInfo(){
    Person::displayPersonInfo();
    Worker::displayWorkerInfo();
    cout<< "Employee ID: " << employeeID << "\n"
        << "Department: " << department << "\n";
  }
};

class Contractor : public Person , public Worker {
private:
  int contractorDuration;
  string project;

public:
  Contractor(){
    contractorDuration = 0;
    project = "";
  }

  void setContractorData(string name , int age,int workerID, string role, int contractorDuration, string project){
    Person::setName(name);
    Person::setAge(age);
    Worker::setWorkerID(workerID);
    Worker::setRole(role);
    this -> contractorDuration = contractorDuration;
    this -> project = project;
  }

  int getContractorDuration() const {
    return contractorDuration;
  }

  void setContractorDuration(int contractorDuration) {
    this -> contractorDuration = contractorDuration;
  }

  string getProject() const {
    return project;
  }

  void setProject(string project) {
    this -> project = project;
  }

  void displayPersonInfo(){
    Person::displayPersonInfo();
    cout<< "Employee ID: " << contractorDuration << "\n"
        << "Project: " << project << "\n";
  }

  void displayWorkerInfo(){
    Worker::displayWorkerInfo();
    cout<< "Employee ID: " << contractorDuration << "\n"
        << "Project: " << project << "\n";
  }

  void showProject(){
    cout<< "Project: " << project << "\n";
  }

  void displayInfo(){
    Person::displayPersonInfo();
    Worker::displayWorkerInfo();
    cout<< "Employee ID: " << contractorDuration << "\n"
        << "Project: " << project << "\n";
  }
};

class Manager : public Employee {
private:
  int numTeams;

public:
  Manager(){
    numTeams = 0;
  }

  Manager(string name , int age,int workerID, string role, int employeeID, string department, int numTeams) {
    Employee::setEmployeeData(name, age, workerID, role, employeeID, department);
    this -> numTeams = numTeams;
  }

  int getNumTeams() const {
    return numTeams;
  }

  void setNumTeams(int numTeams) {
    this -> numTeams = numTeams;
  }

  void displayInfo(){
    Employee::displayInfo();
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

  Engineer(string name , int age,int workerID, string role, int employeeID, string department, string specialization){
    Employee::setEmployeeData(name, age, workerID, role, employeeID, department);
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

class Freelancer : public Contractor {
private:
  double hourlyRate;
public:
  Freelancer(){
    hourlyRate = 0.0;
  }

  Freelancer(string name , int age,int workerID, string role, int employeeID, string department, double hourlyRate){
    Contractor::setContractorData(name, age, workerID, role, employeeID, department);
    this -> hourlyRate = hourlyRate;
  }

  void displayInfo(){
    Contractor::displayInfo();
    cout << "Hours Rate: " << hourlyRate << "\n";
  }

  void showHourlyRate(){
    cout << "Hours Rate: " << hourlyRate << "\n";
  }
};

/*
frlanc = Freelancer("ziad" , 19 ,305 , "Freelancer" , 5 , "stavital" , 75.5 )
*/

int main(){
  Manager manager("Badawi", 20, 213546, "Project Manager", 12354, "Flutter", 2);
  Engineer engineer("Ahmed", 20, 256946, "AI Developer", 45978, "Development", "AI");
  Freelancer freelancer("Hosny", 20, 458654, "Freelancer", 56897, "Architect", 65.8);

  cout << "*********** Manger ***********\n";
  manager.displayInfo();
  cout << "*********** Engineer **********\n";
  engineer.displayInfo();
  cout << "*********** Freelancer **********\n";
  freelancer.displayInfo();

  return 0;
}