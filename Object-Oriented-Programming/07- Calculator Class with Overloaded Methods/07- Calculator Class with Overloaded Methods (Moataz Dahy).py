# Author : MoaTaz DaHy

class Calculator :
  
  def add_int(self, num1=0, num2=0):
    return int(num1 + num2)

  def add_double(self, num1=0.0, num2=0.0, num3=0.0):
    return float(num1 + num2 + num3)

  def add_arrayInt(self, array):
    sum = 0
    for i in array:
      sum += i
    return int(sum)

  def add_arrayDouble(self, array):
    sum = 0.0
    for i in array:
      sum += i
    return float(sum)


intger_sum = 0
double_sum = 0.0
array_sum1 = []
array_sum2 = []

if __name__ == "__main__":
  
   calc = Calculator()
   intger_sum = calc.add_int(1,9) 
   double_sum = calc.add_double(3.0,2.0,3.0)
   array_sum1 = calc.add_arrayInt([1,2,3,4,5])
   array_sum2 = calc.add_arrayDouble([1.0,2.0,3.0])

print("The Sum Of Two Integer Numbers :", intger_sum)
print()
  

print("The Sum Of Three double Numbers :", double_sum)
print()


print("The Sum Of Integer Array Numbers :",array_sum1)
print()

print("The Sum Of Double Array Numbers :",array_sum2)
print()