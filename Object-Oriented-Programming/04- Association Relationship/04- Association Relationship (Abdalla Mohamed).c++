#include <iostream>
#include <algorithm>
using namespace std;

 class Coures
{
private:
    string coures_name;
    int duration ;
public:
    Coures(string coures_name,int duration)
    {
        this->coures_name=coures_name;
        this->duration=duration;
    }
    void set_course_name(string course_name){this->coures_name=coures_name;}
    string get_coures_name(){return coures_name;}
    void set_duration(int duration){this->duration=duration;}
    int get_duration(){return duration;}
};

class Student{
private:
    string name;
    int age;
    int rollNum;
    Coures*arr_course[20];
    int Cou_counnt=0;
public:
    Student(string name,int age,int rollNum)
    {
        this->name=name;
        this->age=age;
        this->rollNum=rollNum;
        this->Cou_counnt=0;
    }
    void set_name(string name){this->name=name;}
    string get_name(){return name;}
    void set_age(int age){this->age=age;}
    int get_age(){return age;}
    void set_rllNum(int rollNum){this->rollNum=rollNum;}
    int get_rollNum(){return rollNum;}

     void add_Course(Coures*Coures) {
        if ( Cou_counnt<20 ) {
            arr_course[Cou_counnt] = Coures;
            Cou_counnt++;
        }

     }
     void print_coures()
     {
         for(int i=0;i<=Cou_counnt;i++)
         {
             cout<<arr_course[i]->get_coures_name()<<endl;
         }
     }

    int num_of_course()
    {
        return Cou_counnt;
    }

};

int main()
{
    Coures c1("OPP", 12);
    Coures c2("DS", 10);
    Coures c3("OR", 8);

    Student S1("Abdalla",20,5);

    S1.add_Course(&c1);
    S1.add_Course(&c2);
    S1.add_Course(&c3);
   S1.print_coures();

    Student S2("df",20,5);
     S2.add_Course(&c1);
    S2.add_Course(&c2);
    S2.print_coures();
    return 0;
}



