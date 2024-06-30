class Student :
   
    def __init__(self , name = None , age = 0 , grade= 0.0) :
        self.__name = name 
        self.__age = age
        self.__grade = grade
        

    @classmethod
    def name_age(cls , name , age) :
       return cls(name , age , 0.0) 


    def setName(cls , name) :
        cls.__name = name
    
    def setAge(cls , age) :
        cls.__age = age   

    def setGrade(cls , grade) :
        cls.__grade = grade        



    def getName(cls) :
        return cls.__name 
    
    def getAge(cls) :
        return cls.__age    

    def getGrade(cls) :
        return cls.__grade 
    
    
    
    def printDetails(cls) :
        return f"Name of Student : {cls.__name}\nAge of student : {cls.__age}\ngrade of student {cls.__grade} \n"

student1 = Student()

student1.setName("Moahmed")
student1.setAge(22)
student1.setGrade(3.92)


student2 = Student.name_age("khalifa" , 20)

print(student1.printDetails())
print(student2.printDetails())







       


