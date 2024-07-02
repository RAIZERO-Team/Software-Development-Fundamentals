#include <iostream>
using namespace std;

class Complex {
private:
  int _real;
  int _img;

public:
  Complex(){
    _real = 0;
    _img = 0;
  }

  Complex(int realNumber, int imgNumber){
    this->_real = realNumber;
    this->_img = imgNumber;
  }

  int get_real(){
    return _real;
  }

  void set_real(int realNumber){
    _real = realNumber;
  }

  int get_img(int imgNumber){
    return _img;
  }

  void set_img(int imgNumber){
    _img = imgNumber;
  }

  void addComplex(Complex &complexNumber){
    this -> _real = _real + complexNumber._real;
    this -> _img = _img + complexNumber._img;
  }

  void subComplex(Complex &complexNumber){
    this -> _real = _real - complexNumber._real;
    this -> _img = _img - complexNumber._img;
  }

  void printComplex(){
    cout<<"The Result: "<<_real <<" + " << _img << "i"<<"\n\n";
  }
};

int main(){
  Complex c1(3, 4), c2(1, 2);
  c1.addComplex(c2);
  c1.printComplex();  // The Result: 4 + 6i

  Complex c3(10, 8), c4(5, 4);
  c3.subComplex(c4);
  c3.printComplex();  // The Result: 5 + 4i

  return 0;
}