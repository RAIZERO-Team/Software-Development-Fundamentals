//Dart does not support method overloading

class Calculator {
  void addIntNumbers(int x, int y) {
    print(x + y);
  }

  void addDoubleNumbers(double x, double y, double z) {
    print(x + y + z);
  }

  void addArrayOfInt(List<int> integers) {
    int sum = 0;
    for (int num in integers) {
      sum += num;
    }
    print(sum);
  }

  void addArrayOfDouble(List<double> doubles) {
    double sum = 0;
    for (double num in doubles) {
      sum += num;
    }
    print(sum);
  }
}

void main() {
  Calculator calc1 = Calculator();
  calc1.addIntNumbers(1, 2);
  calc1.addDoubleNumbers(1.0, 2.0, 3.0);
  calc1.addArrayOfInt([1, 2, 3, 4, 5]);
  calc1.addArrayOfDouble([1.0, 2.0, 3.0 , 4.0]);

}
