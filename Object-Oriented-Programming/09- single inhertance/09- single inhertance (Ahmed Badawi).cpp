#include <iostream>
#include<math.h>
using namespace std;

class Shape {
protected:
  double width;
  double height;

public:
  Shape(){
    width = 0.0;
    height = 0.0;
  }

  Shape(double width, double height) {
    this -> width = width;
    this -> height = height;
  }

  double getWidth() const { 
    return width;
  }

  void setWidth(double width) {
    this -> width = width;
  }
  

  double getHeight() const {
    return height;
  }

  void setHeight(double height) {
    this -> height = height;
  }

  virtual double getArea(void)
  {
    return 0;
  }
};

class Circle : Shape{
  double radius;
  double PI = 3.1415926;

public:
  Circle(){
    Shape();
    this -> radius = 0.0;
  }

  Circle(double radius){
    Shape(0, 0);
    this -> radius = radius;
  }

  double getRadius() const { 
    return radius; 
  }

  double getArea() {
    return PI * radius * radius;
  }

};

int main(){
  Circle circle1(50);
  cout << circle1.getArea() << endl;
  return 0;
}