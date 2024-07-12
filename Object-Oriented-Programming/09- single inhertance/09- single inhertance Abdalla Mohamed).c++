#include <iostream>
#include<algorithm>
#include<string>
#include<math.h>
using namespace std;
 class Shape
 {
protected:
     int width;
     int height;
 public:
     Shape(int width,int height)
     {
         this->width=width;
         this->height=height;
     }
     void set_width(double width){this->width=width;}
     double get_width(){return width;}
     void set_height(double height){this->height=height;}
     double get_height(){return height;}
     double calculate_area(){return width * height;}
 };

 class Circle : public Shape
 {
 private:
     double radius;
 public:
     Circle(double radius):Shape(0,0)
     {
         this->radius=radius;

     }
     double get_radius(){return radius;}
     double calculate_area(){return M_PI * radius * radius;}


 };
int main()
{
    double radius;cin>>radius;
    Circle C(radius);
    cout<<C.calculate_area();


}
