#include <iostream>
#include <vector>
using namespace std;

class Calculator {

public:

  void add(int num1, int num2){
    cout << num1 + num2 << "\n";
  }

  void add(double num1, double num2, double num3) {
    cout << num1 + num2 + num3 << "\n";
  }

  void add (vector<int> arr) {
    int sum = 0;
    for (int i = 0; i < arr.size(); i++)
    {
      sum += arr[i];
    }
    cout << sum << "\n";
  }

  void add (vector<double> arr) {
    double sum = 0;
    for (int i = 0; i < arr.size(); i++)
    {
      sum += arr[i];
    }
    cout << sum << "\n";
  }
};

int main(){
  Calculator c1;
  c1.add(5, 10);
  c1.add(500.5, 200.5, 100.0);

  vector<double> intVector = {5, 10};
  vector<double> doubleVector = {5.5, 10.5};
  c1.add(intVector);
  c1.add(doubleVector);

  return 0;
}