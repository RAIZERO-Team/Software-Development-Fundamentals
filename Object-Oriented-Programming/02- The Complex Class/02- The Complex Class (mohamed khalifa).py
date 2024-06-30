class Complex :
    def __init__(self , real = None , img = None):
        self.__real = real 
        self.__img = img

    def set_real(cls , real):
        cls.__real = real

    def set_img(cls , img):
        cls.__img = img   

    def get_real(cls):
        return cls.__real

    def get_img(cls):
        return cls.__img

    def AddComplex(cls , complex):
        complex.__real += cls.__real
        complex.__img  += cls.__img
        return complex
    
    def SubComplex(cls , complex):
        complex.__real -= cls.__real
        complex.__img  -= cls.__img
        return complex
    
    def PrintComplex(cls) :
        print(f"real part = {cls.__real} , img part = {cls.__img}")

    


c1 = Complex(2 , 4)
c2= Complex(2 , 8)


c3 = c1.AddComplex(c2)
c3.PrintComplex()

c3 = c1.SubComplex(c2)
c3.PrintComplex()






