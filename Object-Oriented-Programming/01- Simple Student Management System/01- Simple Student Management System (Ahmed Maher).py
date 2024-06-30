class Student :
    def __init__(self , name="" , age= 0 , grade =0.0 ):
        self.__name = name
        self.__age = age
        self.__grade = grade

    @classmethod
    def from_two_argument(cls , name="" , age = 0):
        return cls (name , age , 0.0)

    def getName(self):
        return self.__name
    def getAge(self):
        return self.__age
    def getGrade(self):
        return self.__grade

    def setName(self , newName):
        self.__name = newName 
    def setAge(self, newAge):
        self.__age = newAge  

    def setGrade(self, newGrade):
        self.__grade = newGrade  

    def allInfo(self):
        return f"Name is : {self.getName()} , the age is : {self.getAge()} and the grade is : {self.getGrade()}"
    


S1 = Student ()
S1.setName("Ma7er")
S1.setAge(21)
S1.setGrade(3.8)

print(S1.allInfo())

S2 = Student("maher" , 21)
print(S2.allInfo())
