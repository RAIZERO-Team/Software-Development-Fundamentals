# Moataz dahy

class Student:
    def __init__(self, name, age, grade):
        self.__name = name
        self.__age = age
        self.__grade = grade

    def __init__(self, name="", age=0, grade=0.0):
        self.__name = name
        self.__age = age
        self.__grade = grade

    def copy(self, name, age):
        return Student(name, age, self.__grade)
    def setname(self, name):
        self.__name = name

    def getname(self):
        # print("Name :", self.__name)
        return self.__name

    def setage(self, age):
        self.__age = age

    def gatage(self):
        # print("Age :", self.__age)
        return self.__age

    def setgrade(self, grade):
        self.__grade = grade

    def getage(self):
        # print("Grade :", self.__age)
        return self.__grade
    def printDetails(self):
        print("Name :", self.__name)
        print("Age :", self.__age)
        print("Grade :", self.__grade)


S1 = Student()
S1.setname("zizo")
S1.setage(21)
S1.setgrade(2.8)
S1.printDetails()
print()

S2 = Student()
S2.setname("Abdo")
S2.setage(20)
S2.setgrade(3.0)
S2.printDetails()
