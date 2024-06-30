class ComplexNumber {
  double real;
  double img;

  ComplexNumber(this.real, this.img);

  double get real_num => real;

  set real_num(double value) {
    real = value;
  }

  double get img_num => img;

  set img_num(double value) {
    img = value;
  }

  void AddComplex(ComplexNumber newNumber) {
    real += newNumber.real;
    img += newNumber.img;
  }

  void SubComplex(ComplexNumber newNumber) {
    real -= newNumber.real;
    img -= newNumber.img;
  }

  void PrintComplex() {
    print("$real + ${img}i");
  }
}
void main() {
  ComplexNumber c1 = new ComplexNumber(1, 2);
  ComplexNumber c2 = new ComplexNumber(3, 4);
  c1.AddComplex(c2);
  c1.PrintComplex();

}
