#include <iostream>
#include <algorithm>
using namespace std;

class Complex
{
private:
    int real;
    int img;
public:
    Complex(int real,int img)
    {
        this->real=real;
        this->img=img;
    }
    void set_real(int real)
    {
        this->real=real;
    }
     int get_real()
    {
        return real;
    }
     void set_img(int img)
    {
        this->img=img;
    }
     int get_img()
    {
        return img;
    }
    void AddComplex(Complex c1)
    {
        this->real+=c1.real;
        this->img+=c1.img;
    }
     void SubComplex(Complex c3)
    {
        this->real-=c3.real;
        this->img -=c3.img;
    }


     void PrintComplex()
  {
    cout<<real<<"+"<<img<<"i"<<endl;
  }

     void PrintComplex1()
  {
    cout<<real<<"-"<<img<<"i"<<endl;
  }
};


int main()
{
    Complex c1 (4,5);
    Complex c2 (1,2);
   c2.AddComplex(c1);
   c2.PrintComplex();
  cout<<"#######################"<<endl;

   Complex c3 (4,5);
   Complex c4 (1,2);
  c4.SubComplex(c3);
  c4.PrintComplex1();



    return 0;
}



