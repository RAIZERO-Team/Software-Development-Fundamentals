#include <iostream>

using namespace std;
class Fraction
{
private:
    int numerator;
private:
    int denominator;
public:
    Fraction()
    {
        denominator=1;
    }
    Fraction(int num,int den)
    {
        numerator=num;
        denominator=den;
    }

    void SetNumerator (int num)
    {
        numerator=num;

    }
    int GetNumerator ()
    {
        return numerator;
    }
    void SetDenominator (int Den)
    {
        if(denominator!=0)
        {
            denominator=Den;
        }


    }


    int GetDenominator ()
    {
        return denominator;
    }
    void printFraction()
    {
        cout<<Fraction::GetNumerator()<<"/"<<
            Fraction::GetDenominator();
    }
    Fraction operator+(Fraction F2)
    {
        int num = (numerator * F2.denominator) + (denominator * F2.numerator);
        int den = denominator * F2.denominator;
        return Fraction(num, den);
    }
    Fraction operator-(Fraction F2)
    {
        int num = (numerator * F2.denominator) - (denominator * F2.numerator);
        int den = denominator * F2.denominator;
        return Fraction(num, den);
    } Fraction operator*(Fraction F2)
    {
        int num = numerator * F2.numerator;
        int den = denominator * F2.denominator;
        return Fraction(num, den);
    }
    Fraction operator/(Fraction F2)
    {
        if (F2.numerator == 0)
        {
            cout<<"Cannot divide by zero";
        }
        int num = numerator * F2.denominator;
        int den = denominator * F2.numerator;
        return Fraction(num, den);
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
    Fraction F1(1,2);
    Fraction F2(3, 4);
    cout<<"The operator (+) is = ";
    Fraction F3=F1+F2;
    F3.printFraction();

    cout<<"The operator (-) is = ";
    Fraction F6=F1-F2;
    F6.printFraction();
    cout<<"The operator (*) is = ";
    Fraction F9=F1*F2;
    F9.printFraction();

    cout<<"The operator (/) is = ";
    Fraction F12=F1/F2;
    F12.printFraction();


    cout<<"The operator == "<<endl;
    if (F1 == F2)
    {
        cout <<"This are Equal"<<endl;
    }
    else
    {
        cout <<"This are not Equal"<<endl;
    }

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
