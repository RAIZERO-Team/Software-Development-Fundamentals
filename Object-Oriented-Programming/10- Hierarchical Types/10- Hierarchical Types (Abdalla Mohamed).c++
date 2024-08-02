#include <iostream>
#include<algorithm>
#include<string>
#include<math.h>
using namespace std;
 class Vehicle
 {
private:
     string brand;
     string model;
 public:
     Vehicle(string brand,string model)
     {
         this->brand=brand;
         this->model=model;
     }
     void displayInfo()
     {
         cout<<"The brand is "<<brand<<endl;
         cout<<"The model is "<<model<<endl;
     }
 };
 class Car:Vehicle
 {
 private:
    int numDoors;
public:
    Car(string brand,string model,int numDoors):Vehicle(brand,model)
    {
        this->numDoors=numDoors;
    }
public:
    void displayInfo()
    {
        cout<<"The Number Of Door this car :"<<numDoors<<endl;
        Vehicle::displayInfo();
    }
 };
 class Bike:Vehicle
 {
 private:
    int numGears;
 public:
    Bike(string brand,string model,int numGears):Vehicle(brand,model)
    {
        this->numGears=numGears;
    }
    void displayInfo()
    {
        cout<<"The Number Of Gears this Bike :"<<numGears<<endl;
        Vehicle::displayInfo();
    }
 };
int main()
{
    cout<<"The Info Car"<<endl;
   Car c1("Verna","Hyundai",4);
   c1.displayInfo();
   cout<<"_______________________________________________________"<<endl;
   cout<<"The Info Bike"<<endl;
   Bike b1("Scooter","Hyundai",3);
   b1.displayInfo();
}
