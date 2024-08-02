#include <iostream>
#include<algorithm>
#include<string>
#include<math.h>
using namespace std;
class Shape
{
private:
    static int connut;
public:
    Shape()
    {
        connut++;
    }
     static int getCounter()
    {
        return connut;
    }
    void draw()
    {
        cout<<"Drawing a shape"<<endl;
    }
};
class Circle :public Shape
{
private:
    static int connut;
public:
    Circle ()
    {
        connut++;
    }
    static int getCounter()
    {
        return connut;
    }
    void draw ()
    {
        cout<<"Drawing a circle"<<endl;
    }
};
class Rectangle:public Shape
{
private:
    static int connut;
public:
    Rectangle ()
    {
        connut++;
    }
     static int getCounter()
    {
        return connut;
    }
    void draw ()
    {
        cout<<"Drawing a Rectangle"<<endl;
    }
};
int Shape::connut=0;
int Circle::connut=0;
int Rectangle::connut=0;
int main()
{
    Shape S1,S2,S3;
    Circle c1,c2,c3;
    Rectangle R1,R2,R3;

    S1.draw();S2.draw();S3.draw();
    c1.draw();c2.draw();c3.draw();
    R1.draw();R1.draw();R1.draw();
    cout<<endl;
    cout<<"The Total Number Of Shape is = "<< Shape::getCounter()<<endl;
    cout<<"The Total Number Of Circle is = "<<Circle::getCounter()<<endl;
    cout<<"The Total Number Of Rectangle is = "<<Rectangle::getCounter()<<endl;



    return 0;
}
