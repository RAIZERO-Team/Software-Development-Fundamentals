// Author: Reem Ezzat

#include <iostream>

using namespace std;
class Fraction{
private: int numerator,denominator;


public :
    Fraction (int N = 0 , int D =1)
    {
        numerator = N ;

        denominator = D ;
        if(Check_Denominator()==0){
            cout<<"ERROR"<<endl;
                throw std::invalid_argument("denominator can't be zero");
        }

    }
///Setters and Getters
 void Set_Numerator (int N){
 numerator=N;

 }
int Get_Numerator ()
    {
        return numerator;
    }
 void Set_Denominator (int D){
denominator=D;


}


int Get_Denominator ()
    {
        return denominator;
    }

///check if denominator equal to zero
    bool Check_Denominator(){
        bool allowed;
       if(denominator==0){

        allowed= false;

       }
  else{
  allowed=true;
    return allowed;
    }

}

///print fractions
               void print_fraction(Fraction F1,Fraction F2){
cout<<F1.numerator<<" / "<<F1.denominator<<endl;
cout<<F2.numerator<<" / "<<F2.denominator<<endl;


}
 ///Sum

         Fraction operator+ (Fraction F1){

          Fraction SumResult;

          if(denominator==F1.denominator){

         SumResult.numerator = this-> numerator +  F1.numerator;

         SumResult.denominator=F1.denominator;
            }

           else{
          SumResult.denominator= this-> denominator*  F1.denominator;

           SumResult.numerator=(this-> numerator* F1.denominator)+( F1.numerator*this-> denominator);
             }
        return SumResult;

              }
///Subtract
    Fraction operator- (Fraction F1){

    Fraction SubResult;

    if(denominator==F1.denominator){

    SubResult.numerator = this-> numerator -  F1.numerator;

    SubResult.denominator=F1.denominator;
    }
    else{
    SubResult.denominator= this-> denominator*  F1.denominator;

    SubResult.numerator=(this-> numerator* F1.denominator)-( F1.numerator*this-> denominator);
    }
        return SubResult;


    }

///Multiply

    Fraction operator* (Fraction F1){
    Fraction Multiply;
    Multiply.numerator= this->numerator* F1.numerator;
    Multiply.denominator= this->denominator * F1.denominator;



    return Multiply;

    }
///Divide
          Fraction operator/ (Fraction F1){
          Fraction Divide;
             if(F1.numerator==0){
             cout<<"ERROR--> will result undefined value of divide"<<endl;
             Divide.numerator=0;
             Divide.denominator= 0;
             return Divide ;
             }

            else{

            Divide.numerator=this->numerator *F1.denominator;

            Divide.denominator= this->denominator *F1.numerator;

            return Divide;
              }

         }


///To Simplify result

    void simplify(){

         for (int i = denominator; i>=2; i--) {

            if (numerator % i == 0 && denominator % i == 0){

             numerator = numerator/i;
             denominator = denominator/i;
             }
         }
    }

///Are Equal?

    bool operator ==(Fraction F1){

     simplify();
if(numerator==0&&F1.numerator==0)
    return 1;
    else
    return (numerator== F1.numerator && denominator == F1.denominator);
    }

///Are Not Equal?
    bool operator !=(Fraction F1)
    {


  simplify();
if(numerator==0&&F1.numerator==0)
    return 0;
else
    return (numerator!= F1.numerator || denominator != F1.denominator);
    }




///Print

 void print(){

//To Simplify result
   simplify();
     if (numerator==0){
       cout<<"0"<<endl;
     }
  else{
  cout<<numerator<<" / "<<denominator<<endl;}
      }

///Print If equal
void printIfEqual(){
cout<< (numerator)<<endl;

}

};



int main()
{
    Fraction F1(4,6),F2(2,5);

cout<<"Fractions Are: "<<endl;
Fraction result;
result.print_fraction(F1,F2);

//operations
 Fraction sum_result= F1+F2;

 Fraction sub_result= F1-F2;

 Fraction Multiply_result= F1*F2;

 Fraction Divide_result= F1/F2;

Fraction Equlity= (F1==F2);

Fraction InEquality= (F1!=F2);




cout<<"result of sum"<<endl;

sum_result.print();
cout<<"result of subtract"<<endl;

sub_result.print();

cout<<"result of multiply"<<endl;

Multiply_result.print();

cout<<"result of Divide"<<endl;

Divide_result.print();
cout<<"Are fractions equal?"<<endl;

Equlity.printIfEqual();

cout<<"Are fractions unequal?"<<endl;

InEquality.printIfEqual();

 return 0;
}
