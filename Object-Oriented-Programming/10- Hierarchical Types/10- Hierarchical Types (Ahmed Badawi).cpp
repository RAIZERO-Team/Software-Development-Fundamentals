#include <iostream>
using namespace std;

class Vehicle {
protected:
  string brand;
  string model;

public:

  Vehicle (){
    this -> brand = "";
    this -> model = "";
  }

  Vehicle (string brand, string model){
    this -> brand = brand;
    this -> model = model;
  }

  void setValues(string brand, string model){
    this -> brand = brand;
    this -> model = model;
  }

  virtual void displayInfo(void) {
    cout << " ";
  }
};

class Car : public Vehicle {
  int numDoors;

public:
  Car (){
    Vehicle();
    numDoors = 0;
  }

  Car (int numDoors) {
    this -> numDoors = numDoors;
  }

  void displayInfo(){
    cout  << "Brand:" << brand << "\n"
          << "Model:" << model << "\n"
          << "Num of Doors:" << numDoors << "\n\n";
  }
};

class Bikes : public Vehicle {
  int numGears;

public:
  Bikes(){
    Vehicle();
    numGears = 0;
  }

  Bikes(int numGears) {
    this -> numGears = numGears;
  }


  void displayInfo(){
    cout  << "Brand:" << brand << "\n"
          << "Model:" << model << "\n"
          << "Num of Gears:" << numGears << "\n";
  }
};

int main(){
  Car car(4);
  Bikes bike(2);
  Vehicle vehicle;
  Vehicle *p1, *p2, *p3;

  p1 = &car;
  p2 = &bike;
  p3 = &vehicle;

  p1 -> setValues("Marcedes", "G15");
  p2 -> setValues("Nike", "N45d");
  p3 -> setValues("Brand", "Model");

  p1->displayInfo();
  p2->displayInfo();
  p3->displayInfo();
  return 0;
}