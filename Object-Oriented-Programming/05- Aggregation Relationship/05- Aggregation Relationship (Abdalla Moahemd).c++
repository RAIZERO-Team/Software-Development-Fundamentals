#include <iostream>
#include<algorithm>
#include <string>
using namespace std;
class Department
{
private:
   string departmentName;
   string location;
   string headOfDepartment;
public:
    Department(string departmentName,string location,string headOfDepartment)
    {
         this->departmentName=departmentName;
         this->location=location;
         this->headOfDepartment=headOfDepartment;
    }
    void set_departmentName(string departmentName){this->departmentName=departmentName;}
    string get_departmentName(){return departmentName;}

    void set_location(string location){this->location=location;}
    string get_location(){return location;}

    void set_headOfDepartmen(string ){this->headOfDepartment=headOfDepartment;}
    string get_headOfDepartmen(){return headOfDepartment;}
};
class University
{
private:
    string name;
    Department*department[10];
    int Cou_depart=0;
public:
    University(string name)
    {
        this->name=name;
        this->Cou_depart=0;
    }
    void add_department(Department*Department)
    {
        if(Cou_depart<10)
        {
            department[Cou_depart]=Department;
            Cou_depart++;
        }
    }
    void printD()
    {
     for (int i=0;i<=Cou_depart;i++)
     {
         cout<<department[i]->get_departmentName()<<endl;
         cout<<department[i]->get_location()<<endl;
         cout<<department[i]->get_headOfDepartmen()<<endl;
         cout<<"########################################"<<endl;
     }
    }
};

int main()
{
    Department D1("CS","LAb1","DR.Abdalla");
    Department D2("IT","LAb2","DR.Mohamed");
    Department D3("AI","LAb3","DR.Ail");

    University U1("EELU");
    U1.add_department(&D1);
    U1.add_department(&D2);
    U1.add_department(&D3);
    U1.printD();




   return 0;
}



