#include <iostream>
#include<algorithm>
#include<string>
using namespace std;
  class Fraction
  {
  private:
    int numerator;
    int denominator;
  public:
    Fraction(int denominator=1){}
    Fraction(int numerator,int denominator)
    {
        this->numerator=numerator;
        this->denominator=denominator;
    }
    void set_denominator(int denominator){this->denominator=denominator;}
    int get_denominator()
    {
         if(denominator!=0)
          {
             return denominator;
          }
         else
         {
             cout<<"denominator is equal 0 ";
         }
    }
    void set_numerator(int numerator){this->numerator=numerator;}
    int get_numerator(){return numerator;}
    void print_Fraction()
    {
        cout<<Fraction::get_numerator()<<"/"<<
        Fraction::get_denominator();
    }
    Fraction operator+(Fraction F2)
    {
        Fraction F3;
        F3.numerator=(numerator*F2.denominator)+(denominator*F2.numerator);
        F3.denominator=denominator*F2.denominator;
        return(F3);
    }
     Fraction operator-(Fraction F2)
    {
        Fraction F3;
       F3.numerator=(numerator*F2.denominator)-(denominator*F2.numerator);
        F3.denominator=denominator*F2.denominator;
        return(F3);
    } Fraction operator*(Fraction F2)
    {
        Fraction F3;
        F3.numerator=numerator*F2.numerator;
        F3.denominator=denominator*F2.denominator;
        return(F3);
    }
     Fraction operator/(Fraction F2)
    {
        Fraction F3;
        F3.numerator=(numerator*F2.denominator);
        F3.denominator=denominator*F2.numerator;
        return(F3);
    }
    bool operator==(Fraction F2)
    {
        return(this->numerator==F2.numerator&&this->denominator==F2.denominator);
    }
     bool operator!=(Fraction F2)
    {
        return!(this->numerator==F2.numerator&&this->denominator==F2.denominator);
    }
  };
int main()
{
    cout<<"The operator (+) is = ";
    Fraction F1(5,10);
    Fraction F2(15, 20);
    Fraction F3=F1+F2;
    F3.print_Fraction();
    cout<<endl;
    cout<<"-----------------------------------------"<<endl;
    cout<<"The operator (-) is = ";
    Fraction F4(5,10);
    Fraction F5(15, 20);
    Fraction F6=F4-F5;
    F6.print_Fraction();cout<<endl;
    cout<<"-----------------------------------------"<<endl;
    cout<<"The operator (*) is = ";
    Fraction F7(5,10);
    Fraction F8(15, 20);
    Fraction F9=F7*F8;
    F9.print_Fraction();cout<<endl;
    cout<<"-----------------------------------------"<<endl;
    cout<<"The operator (/) is = ";
    Fraction F10(5,10);
    Fraction F11(15, 20);
    Fraction F12=F10/F11;
    F12.print_Fraction();cout<<endl;
    cout<<"-----------------------------------------"<<endl;
    cout<<"The operator == "<<endl;
   Fraction F13(10,10);
   Fraction F14(10, 10);
    if (F13 == F14)
    {
        cout <<"This are Equal"<<endl;
    }
    else
    {
         cout <<"This are not Equal"<<endl;
    }
    cout<<"-----------------------------------------"<<endl;
    cout<<"The operator !="<<endl;
   Fraction F15(10,10);
   Fraction F16(10,10);
    if (F15 != F16)
    {
        cout <<"This are Equal"<<endl;
    }
    else
    {
         cout <<"This are not Equal"<<endl;
    }

    return 0;
}
