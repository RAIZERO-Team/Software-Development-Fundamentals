# Author: Ahmed Maher

class Fraction :
    def __init__(self , numerator = None , denominator = None) :
        self.__numerator = numerator
        self.__denominator = denominator
        self.checkDenominator()
    
    def checkDenominator(self):
        if self.__denominator == 0:
            return False
    
    def getNumerator(self):
        return self.__numerator
    
    def setNumerator(self , newNumerator):
        self.__numerator = newNumerator
    
    def getDenominator(self):
        return self.__denominator
    
    def setDenominator(self , newDenominator):
        self.__denominator = newDenominator
    
    def __add__(self , newInstanc):
        newFraction = Fraction ()
        newFraction.__numerator = (self.__numerator * newInstanc.__denominator ) + (newInstanc.__numerator * self.__denominator )
        newFraction.__denominator = self.__denominator * newInstanc.__denominator
        return newFraction
    
    def __sub__(self , newInstanc):
        newFraction = Fraction ()
        newFraction.__numerator = (self.__numerator * newInstanc.__denominator ) - (newInstanc.__numerator * self.__denominator )
        newFraction.__denominator = self.__denominator * newInstanc.__denominator
        return newFraction
    
    
    def __mul__(self , newInstanc):
        newFraction = Fraction ()
        newFraction.__numerator = self.__numerator * newInstanc.__numerator 
        newFraction.__denominator = self.__denominator * newInstanc.__denominator
        return newFraction
    
    def __truediv__(self , newInstanc):
        newFraction = Fraction ()
        newFraction.__numerator = self.__numerator * newInstanc.__denominator 
        newFraction.__denominator = self.__denominator * newInstanc.__numerator
        return newFraction 
    
    def __eq__(self, newInstance):
        if self.__numerator * newInstance.__denominator == self.__denominator * newInstance.__numerator:
            return "True"
        else:
            return "False"
    
    def __ne__(self, newInstance):
        if self.__numerator * newInstance.__denominator != self.__denominator * newInstance.__numerator:
            return "True"
        else:
            return "False"
    
    def print(self):
        return f"{self.__numerator}/{self.__denominator}"
    

n1Num = int(input("Enter the numerator to 1 fraction : "))
n1Den = int(input("Enter the denominator to 1 fraction : "))
n2Num = int(input("Enter the numerator to 2 fraction : "))
n2Den = int(input("Enter the denominator to 2 fraction : "))

n1 = Fraction(n1Num, n1Den)
n2 = Fraction(n2Num, n2Den)

print(f"First fraction: {n1.print()}")
print(f"Second fraction: {n2.print()}")

print(f"{n1.print()} + {n2.print()} = {(n1 + n2).print()}")
print(f"{n1.print()} - {n2.print()} = {(n1 - n2).print()}")
print(f"{n1.print()} * {n2.print()} = {(n1 * n2).print()}")
print(f"{n1.print()} / {n2.print()} = {(n1 / n2).print()}")

print("Checking equality:")
print(f"{n1.print()} == {n2.print()} : {n1 == n2}")
print(f"{n1.print()} != {n2.print()} : {n1 != n2}")