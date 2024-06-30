#include <iostream>
using namespace std;

class Student {

private:
  string std_name;
  int std_age;
  double std_grade;

public:
  Student(){
    std_name = "";
    std_age = 0;
    std_grade = 0.00;
  }

  Student(string name, int age, double grade){
    this->std_name = name;
    this->std_age = age;
    this->std_grade = grade;
  }

  Student (Student &copy){
    this->std_name = copy.std_name;
    this->std_age = copy.std_age;
  }

  string getName(){
    return std_name;
  }

  void setName(string name){
    this->std_name = name;
  }

  int getAge(){
    return std_age;
  }

  void setAge(int age){
    this->std_age = age;
  }

  double getGrade(){
    return std_grade;
  }

  void setGrade(double grade){
    this->std_grade = grade;
  }


  void printData(){
    cout<< "=============== Student Datails ===============\n"
        <<"Name:  "<<std_name<<"\n"
        <<"Age:   "<<std_age<<"\n"
        <<"Grade: "<<std_grade<<"\n";
  }
};

int main(){

  // Student 1 details
  Student std1;
  std1.setName("Jhon Doe");
  std1.setAge(22);
  std1.setGrade(3.87);
  std1.printData();

  // Student 2 details
  Student std2("Jhon Doe", 22, 3.87);
  std2.printData();

  return 0;
}