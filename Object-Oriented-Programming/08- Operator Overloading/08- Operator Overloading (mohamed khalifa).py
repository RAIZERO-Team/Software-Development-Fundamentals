class Fraction :
    def __init__(self ,numerator , denominator) -> None:
        self.__numerator   = numerator
        self.__denominator = denominator if not self.checkDenominator(denominator) else print("sory , denominator can not be zero")

    @staticmethod
    def checkDenominator( denominator):
        return denominator == 0

    def set_numerator(self , numerator):
        self.__numerator = numerator

    def set_denominator(self , denominator):
        self.__denominator = denominator if not self.checkDenominator(denominator) else print("sory , denominator can not be zero")

    def get_numerator(self):
        return self.__numerator  

    def get_denominator(self):
        return self.__denominator
    
    
    def print(self):
        if self.__denominator == 1 : print(self.__numerator)
        elif self.__numerator == 0 : print(0)
        elif self.__denominator == self.__numerator : print(1)
        elif self.__denominator == -1 : print(f"{-self.__numerator}")
        else : print(f"{self.__numerator}/{self.__denominator}")    


    def __add__(self , fraction):
        denominator = self.__denominator * fraction.get_denominator()
        numerator = (self.__numerator * fraction.get_denominator()) + (self.__denominator * fraction.get_numerator())
        return Fraction(numerator , denominator)
    
    def __sub__ (self , fraction):
        denominator = self.__denominator * fraction.get_denominator()
        numerator = (self.__numerator * fraction.get_denominator()) - (self.__denominator * fraction.get_numerator())
        return Fraction(numerator , denominator)
    
    def __mul__(self , fraction):
        denominator = self.__denominator * fraction.get_denominator()
        numerator =   self.__numerator * fraction.get_numerator() 
        return Fraction(numerator , denominator)
    
    def __truediv__(self , fraction):
        denominator = self.__denominator * fraction.get_numerator()
        numerator =   self.__numerator * fraction.get_denominator()
        return Fraction(numerator , denominator)
     
    def __eq__(self , fraction):
        return (self.__numerator == fraction.get_numerator() ) and (self.__denominator == fraction.get_denominator())

    def __ne__(self , fraction):
        return (self.__numerator != fraction.get_numerator() ) or (self.__denominator != fraction.get_denominator())

        

f1 = Fraction(2 , 0 ) # denominator can not be zero

f1 = Fraction(1 , 4)
f2 = Fraction(1 , 2)


f3 = f1 + f2  # addition
f3.print()

f3 = f1 - f2  # subtraction
f3.print()

f3 = f1 * f2  # Multiplication
f3.print()

f3 = f1 / f2  # Division  
f3.print()

print(f1 == f2)   # equality
print(f1 != f2)   # inequality  


