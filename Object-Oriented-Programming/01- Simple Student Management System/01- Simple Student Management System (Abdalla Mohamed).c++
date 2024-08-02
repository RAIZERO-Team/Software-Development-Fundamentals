#include <iostream>
#include <algorithm>
using namespace std;

class Student
{
private:
    string name;
    int age;
    double grade;
public:
    Student() {}
    Student(string name,int age, double grade)
    {
        this->name=name;
        this->age=age;
        this->grade=grade;
    }
    Student(string name,int age)
    {
        this->name=name;
        this->age=age;

    }
    void setName(string name)
    {
        this->name=name;
    }
    string getName()
    {
        return name;
    }

    void setAge(int age)
    {
        this->age=age;
    }
    int getAge()
    {
        return age;
    }
    void setGrade(double grade)
    {
        this->grade = grade;
    }
    double getGrade()
    {
        return grade;
    }
    void ptintD()
    {
        cout<<"Name is "<<name<<endl;
        cout<<"Age is  "<<age<<endl;
        cout<<"Grade is "<<grade<<endl;
    }
};

int main()
{
    Student S1;
    S1.setName("Abdalla");
    S1.setAge(21);
    S1.setGrade(4.5);
    S1.ptintD();
    cout<<"##############################################"<<endl;
    Student S2("Abdalla",21,10.5);
    S2.ptintD();

    return 0;
}



