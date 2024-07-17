class Shape : 
    counter = 0 
    def __init__(self) :
        Shape.counter +=1

    @staticmethod
    def getCounter() :
        return Shape.counter
    
    def draw(self) : 
        print("Drawing a shape")

class Circle(Shape) : 
    counter = 0 
    def __init__(self) -> None:
        super().__init__()
        Circle.counter +=1

    def draw(self) : 
        print("Drawing a Circle")

    @staticmethod
    def getCounter() :
        return Circle.counter

class Rectangle(Shape) : 
    counter = 0 
    def __init__(self) -> None:
        super().__init__()
        Rectangle.counter +=1

    def draw(self) : 
        print("Drawing a Rectangle")

    @staticmethod
    def getCounter() :
        return Rectangle.counter    


shape1 = Shape()
shape2 = Shape()
circle1 = Circle()
circle2 = Circle()
rectangle1 = Rectangle()
rectangle2 = Rectangle()
rectangle3 = Rectangle()

shape1.draw()
shape2.draw()
circle1.draw()
circle2.draw()
rectangle1.draw()
rectangle2.draw()
rectangle3.draw()

print(f"Total Shapes: {Shape.getCounter()}")
print(f"Total Circles: {Circle.getCounter()}")
print(f"Total Rectangles: {Rectangle.getCounter()}")




