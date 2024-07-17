#include <iostream>
using namespace std;

class Fraction {
  int numerator;
  int denominator;

public:
  Fraction() : numerator(0), denominator(1) {}

  Fraction(int numerator, int denominator) {
    this -> numerator = numerator;

    if (checkDenominator(denominator)){
      cout << "Wrong denominator, it should be more than 0" << endl;
    } else {
      this -> denominator = denominator;
    }
  }

  int getNumerator() {
    return numerator;
  }

  void setNumerator(int numerator) {
    this -> numerator = numerator;
  }

  int getDenominator() {
    return denominator;
  }

  void setDenominator(int denominator) {
    this -> denominator = denominator;
  }

  bool checkDenominator(int denominator) {
    if (denominator == 0){
      return true;
    } else {
      return false;
    }
  }

  Fraction operator+(Fraction fraction){
    denominator = this -> denominator * fraction.getDenominator();
    numerator = (this -> numerator * fraction.getDenominator()) + (this -> denominator * fraction.getNumerator());
    return Fraction(numerator , denominator);
  }

  Fraction operator-(Fraction fraction){
    denominator = this -> denominator * fraction.getDenominator();
    numerator = (this -> numerator * fraction.getDenominator()) - (this -> denominator * fraction.getNumerator());
    return Fraction(numerator , denominator);
  }

  Fraction operator*(Fraction fraction){
    denominator = this -> denominator * fraction.getDenominator();
    numerator = this -> numerator * fraction.getDenominator();
    return Fraction(numerator , denominator);
  }

  Fraction operator/(Fraction fraction){
    denominator = this -> denominator * fraction.getDenominator();
    numerator = this -> numerator * fraction.getDenominator();
    return Fraction(numerator , denominator);
  }

  bool operator==(Fraction fraction){
    return (numerator == fraction.getNumerator() && denominator == fraction.getDenominator());
  }

  bool operator!=(Fraction fraction){
    return (numerator != fraction.getNumerator() || denominator != fraction.getDenominator());
  }

  void print(){
    cout << this -> numerator << this -> denominator;
  }
};

int main(){
  Fraction f1(1, 4), f2(1, 4), f3;

  f3 = f1 + f2;
  f3.print();
  // f3 = f1 - f2;
  // f3 = f1 * f2;
  // f3 = f1 / f2;

  return 0;
}