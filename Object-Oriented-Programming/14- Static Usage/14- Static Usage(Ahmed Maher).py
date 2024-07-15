# Author: Ahmed Maher

class Shape:
    counter = 0
    @staticmethod
    def getCounter():
        return Shape.counter
    def __init__(self):
        Shape.counter += 1
    def draw(self):
        print("Drawing a shape")

class Circle(Shape):
    counter = 0
    
    @staticmethod
    def getCounter():
        return Circle.counter
    
    def __init__(self):
        super().__init__()
        Circle.counter += 1
    
    def draw(self):
        print("Drawing a circle")

class Rectangle(Shape):
    counter = 0
    @staticmethod
    def getCounter():
        return Rectangle.counter
    
    def __init__(self):
        super().__init__()
        Rectangle.counter += 1
    
    def draw(self):
        print("Drawing a rectangle")

shape1 = Shape() ; shape2 = Shape()
circle1 = Circle() ; circle2 = Circle()
rectangle1 = Rectangle() ; rectangle2 = Rectangle()

shape1.draw() ; shape2.draw()
circle1.draw() ; circle2.draw()
rectangle1.draw() ; rectangle2.draw()

print("Shape counter:", Shape.getCounter())
print("Circle counter:", Circle.getCounter())
print("Rectangle counter:", Rectangle.getCounter())