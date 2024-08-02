# Moataz Dahy
class Shape:
  counter = 0
  
  @staticmethod
  def get_counter():
    return Shape.counter

  def draw(self):
    print("Drawing a shape")

  def __init__(self) :
    Shape.counter += 1

class Circle(Shape):
  counter = 0
  
  def draw(self):
    print("Drawing a circle")

  def __init__(self):
    super().__init__()
    Circle.counter += 1

  @staticmethod
  def get_counter():
    return Circle.counter

class Rectangle(Shape):
  counter = 0
  
  def draw(self):
    print("Drawing a rectangle")

  @staticmethod
  def get_counter():
    return Rectangle.counter

  def __init__(self):
    super().__init__()
    Rectangle.counter += 1



C1 = Circle()
C1.draw()
C2 = Circle()
C2.draw()
print(f"The Number of Circles: {Circle.get_counter()}\n")


R1 = Rectangle()
R1.draw()
R2 = Rectangle()
R2.draw()
print(f"The Number of Rectangles: {Rectangle.get_counter()}\n")


S1 = Shape()
S1.draw()
S2 = Shape()
S2.draw()
print(f"The Number of Shapes: {Shape.get_counter()}\n")






