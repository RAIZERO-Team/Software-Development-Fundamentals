#include <iostream>
using namespace std;


class Shape {
protected:
  static int counter;

public:
  Shape(){
    this -> counter++;
  }

  static int getCounter() {
    return counter;
  }

  void draw(){
    cout << "Drawing a shape\n";
  }
};

int Shape::counter = 0;

class Circle : public Shape {
  static int counter;

public:
  Circle(){
    // Shape();
    this -> counter++;
  }

  static int getCounter() {
    return counter;
  }

  void draw(){
    cout << "Drawing a circle\n";
  }
};

int Circle::counter = 0;

class Rectangle : public Shape {
  static int counter;

public:
  Rectangle(){
    // Shape();
    this -> counter++;
  }

  static int getCounter() {
    return counter;
  }

  void draw(){
    cout << "Drawing a rectangle\n";
  }
};

int Rectangle::counter = 0;

int main(){
  Shape shape1;
  Circle circle1;
  Rectangle rectangle1;

  shape1.draw();
  circle1.draw();
  rectangle1.draw();

  cout << shape1.getCounter() << "\n";
  cout << circle1.getCounter() << "\n";
  cout << rectangle1.getCounter() << "\n";

  return 0;
}