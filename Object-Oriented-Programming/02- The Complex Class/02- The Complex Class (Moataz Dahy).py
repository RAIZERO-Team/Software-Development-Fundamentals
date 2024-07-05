# Moataz Dahy
class Complex :
  def __init__(self, real, img):
    self.real = real
    self.img = img
  
  def set_real(self, real):
    self.real = real

  def get_real(self):
    return self.real

  def set_img(self, img):
    self.img = img

  def get_img(self):
    return self.img

  def AddComplex(self, complexNumber):
    real = self.real + complexNumber.real
    img = self.img + complexNumber.img
    return Complex(real, img)

  def SubComplex(self, complexNumber):
    real = self.real + complexNumber.real
    img = self.img + complexNumber.img
    return Complex(real, img)

  def printall(self):
    print(f"{self.real} + {self.img}i")

c1 = Complex(3, 4)
c2 = Complex(1, 2)

c3 = c1.AddComplex(c2)

c3.printall()

