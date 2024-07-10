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
    Fraction F1(5,10);
    Fraction F2(15, 20);
    cout<<"The operator (+) is = ";
    Fraction F3=F1+F2;
    F3.print_Fraction();
    cout<<endl;
    cout<<"-----------------------------------------"<<endl;
    cout<<"The operator (-) is = ";
    Fraction F6=F1-F2;
    F6.print_Fraction();cout<<endl;
    cout<<"-----------------------------------------"<<endl;
    cout<<"The operator (*) is = ";
    Fraction F9=F1*F2;
    F9.print_Fraction();cout<<endl;
    cout<<"-----------------------------------------"<<endl;
    cout<<"The operator (/) is = ";
    Fraction F12=F1/F2;
    F12.print_Fraction();cout<<endl;
    cout<<"-----------------------------------------"<<endl;
    cout<<"The operator == "<<endl;
    if (F1 == F2)
    {
        cout <<"This are Equal"<<endl;
    }
    else
    {
         cout <<"This are not Equal"<<endl;
    }
    cout<<"-----------------------------------------"<<endl;
    cout<<"The operator !="<<endl;
    if (F1 != F2)
    {
        cout <<"This are Equal"<<endl;
    }
    else
    {
         cout <<"This are not Equal"<<endl;
    }
    return 0;
}
