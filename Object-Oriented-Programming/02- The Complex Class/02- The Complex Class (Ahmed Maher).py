# Author: Ahmed Maher

class Complex :
    def __init__(self , real ,img):
        self.__real = real 
        self.__img = img 

    def getreal(self):
        return self.__real

    def setreal(self , newreal):
        self.__real = newreal 

    def getimg(self):
        return self.__img

    def setimg(self , newimg):
        self.__img = newimg 

    def AddComplex(cls , complex_number) :
        cls.__real += complex_number.__real
        cls.__img += complex_number.__img
        return cls

    def SubComplex(cls , complex_number) :
        cls.__real -= complex_number.__real
        cls.__img -= complex_number.__img
        return cls

    def PrintComplex(cls):
        return f"{cls.__real} + {cls.__img}i"

c1 = Complex(3, 4)

c2 = Complex(1, 2)

c3 = c1.AddComplex(c2) 

print(c3.PrintComplex() )


