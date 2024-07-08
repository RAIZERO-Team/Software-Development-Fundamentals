#include <iostream>
#include<algorithm>
#include <string>
#include<math.h>
using namespace std;

  class City
  {
private:
      string name;
public:
      City(string name)
      {
          this->name=name;
      }
public:
      void set_namecity(string name){this->name=name;}
      string get_namecity(){return name;}
  };
  class State
  {
  private:
      string state_name;
      City *city[10];
      int connt_City=0;
  public:
      State(string state_name)
      {
          this->state_name=state_name;
          this->connt_City=0;
      }
  public:
      void set_state_name(string state_name){this->state_name=state_name;}
      string get_state_name(){return state_name;}
      void add_City(City*City)
      {
          if(connt_City<10)
          {
             city[connt_City]=City;
             connt_City++;
          }
      }
     void print_city()
     {
        for (int i = 0; i < connt_City; i++)
        {
            cout << city[i]->get_namecity() << endl;
        }
     }
  };
  class Country {
private:
    string country_Name;
    State* state[10];
    int connt_state = 0;
public:
    Country(string country_Name) {
        this->country_Name = country_Name;
    }
public:
    void add_State(State* State) {
        if (connt_state < 10) {
            state[connt_state] = State;
            connt_state++;
        }
    }
    void print_state() {
        for (int i =0;i<connt_state;i++) {
            cout << state[i]->get_state_name() << endl;
            state[i]->print_city();
        }
    }
};

int main()
{
    City c1("Cairo");
    City c2("Sohg");
    City c3("Assuit");

    State s1("Egypt");
    s1.add_City(&c1);
    s1.add_City(&c2);
    s1.add_City(&c3);
    s1.print_city();
    cout<<"##################"<<endl;
    Country C1("Egypt");
     C1.add_State(&s1);
     C1.print_state();


    return 0;
}

