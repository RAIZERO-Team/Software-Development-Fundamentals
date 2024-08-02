# Author: Ahmed Maher

import math

class Shape:
    def __init__(self, width=0.0, height=0.0):
        self.__Width = width
        self.__Height = height
    
    def getWidth(self):
        return self.__Width
    
    def setWidth(self, width):
        self.__Width = width
    
    def getHeight(self):
        return self.__Height
    
    def setHeight(self, height):
        self.__Height = height
    
    def calcArea(self):
        return self.__Width * self.__Height


class Circle(Shape):
    def __init__(self, radius):
        Shape.__init__(self , width= radius , height=radius )
        self.__radius = radius
    
    def getRadius(self):
        return self.__radius
    
    def calcArea(self):
        return math.pi * self.__radius * self.__radius

n1 = int(input("Enter the Shape width : "))
n2 = int(input("Enter the Shape height : "))

S = Shape(n1, n2)
print(f"Shape width : {S.getWidth()} \nheight : {S.getHeight()} \narea : {S.calcArea()}")

radius = int(input("Enter the radius to circle : "))

C = Circle(radius)
print(f"Circle radius: {C.getRadius()} \narea: {C.calcArea()}")