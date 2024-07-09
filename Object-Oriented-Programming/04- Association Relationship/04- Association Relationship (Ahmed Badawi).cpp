#include <iostream>
#include <vector>
using namespace std;

class Course{
private:
  string courseName;
  int duration;  // The duration of the course in weeks.

public:
  Course(){
    courseName = "";
    duration = 0;
  }

  Course(string courseName, int duration){
    this -> courseName = courseName;
    this -> duration = duration;
  }

  string get_courseName(){
    return courseName;
  }

  void set_courseName(string courseName){
    this -> courseName = courseName;
  }

  int get_duration(){
    return duration;
  }

  void set_duration(int duration){
    this -> duration = duration;
  }
};

class Student{
private:
  string std_name;
  int std_age;
  int std_rollNumber;
  // int courseNumbers = 0;
  // Course*std_courses[0];
  vector<Course*> std_courses;

public:
  Student(){
    std_name = "";
    std_age = 0;
    std_rollNumber = 0;
  }

  Student(string std_name, int std_age, int std_rollNumber){
    this -> std_name = std_name;
    this -> std_age = std_age;
    this -> std_rollNumber = std_rollNumber;
  }

  string getName(){
    return std_name;
  }

  void setName(string std_name){
    this -> std_name = std_name;
  }

  int getAge(){
    return std_age;
  }

  void setAge(int std_age){
    this -> std_age = std_age;
  }

  int getRollNumber(){
    return std_rollNumber;
  }

  void setRollNumber(int std_rollNumber){
    this -> std_rollNumber = std_rollNumber;
  }

  void add_courses(Course* courses) {
      std_courses.push_back(courses);
  }

  void enrolled_courses() const {
      cout << "\n=========== Student " << std_name << " Course's ===========\n";
      for (const auto& course : std_courses) {
          cout << course->get_courseName() << "\n";
      }
      cout << "==========================\n";
  }
  

  void print_student_details(){
    cout << "\n******** Student Details ********\n"
    << "Student Name: " << std_name << "\n"
    << "Student Age: " << std_age << "\n"
    << "Student Roll Number: " << std_rollNumber << "\n";

    enrolled_courses();
  }
};

int main(){
  Course c1("Flutter", 5);
  Course c2("AI", 9);
  Course c3("Web development", 9);
  Course c4("Cyber security", 7);

  Student std1("Badawi", 20 , 5);
  std1.add_courses(&c1);
  std1.add_courses(&c3);
  std1.print_student_details();
  

  Student std2;
  std2.setName("Ahmed");
  std2.setAge(20);
  std2.setRollNumber(10);
  
  std2.add_courses(&c2);
  std2.add_courses(&c4);
  std2.print_student_details();
  return 0;
}