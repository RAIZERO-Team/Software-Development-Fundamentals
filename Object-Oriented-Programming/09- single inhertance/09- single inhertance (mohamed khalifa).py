import math
class Shape : 
    def __init__(self , width =0.0 , height= 0.0) :
        self.__width = width
        self.__height = height

    def set_width(self , width):
        self.__width = width 

    def set_height(self , height):
        self.__height = height     


    def get_width(self):
        return self.__width    
    
    def get_height(self):
        return self.__height
    
    def calculateArea(self) : pass

class Circle (Shape):

    def __init__(self , radius) -> None:
            super().__init__(radius , radius )
            self._radius = radius

    def calculateArea(self):
        return "{:.3f}".format(math.pi * self._radius ** 2)


    def get_radius(self):
        return self._radius



Circle1 = Circle(2.5)
print(f"the area of circle is {Circle1.calculateArea()}")     