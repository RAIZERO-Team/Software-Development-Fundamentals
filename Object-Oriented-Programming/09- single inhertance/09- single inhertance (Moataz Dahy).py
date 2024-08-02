# Author : Moataz Dahy

import math

class Shape:
    def __init__(self, width=0.0, height=0.0):
        self.__width = width
        self.__height = height

    def set_width(self, width):
        self.__width = width

    def get_width(self):
        return self.__width

    def set_height(self, height):
        self.__height = height

    def get_height(self):
        return self.__height

    def calc_area(self):
        return self.__width * self.__height

class Circle(Shape):
    def __init__(self, radius):
        super().__init__(radius, radius)
        self.__radius = radius

    def get_radius(self):
        return self.__radius

    def calc_area(self):
        return math.pi * self.__radius ** 2

num1 = int(input("Please Enter The Width of The Shape: "))
num2 = int(input("Please Enter The Height of The Shape: "))

S1 = Shape(num1, num2)

print("The Area of The Shape is", S1.calc_area())

radius = int(input("Please Enter The Radius of The Circle: "))

C1 = Circle(radius)

print("The Area of The Circle is", C1.calc_area())
