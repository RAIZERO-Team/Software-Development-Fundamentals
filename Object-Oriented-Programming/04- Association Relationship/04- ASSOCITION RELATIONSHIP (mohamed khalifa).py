class Course :
    def __init__(self , courseName ,duration )  -> None:
        self.__courseName   = courseName
        self.__duration = duration

    def setCourseName(self , courseName) :
        self.__courseName = courseName

    def setDuration(self , duration) :    
        self.__duration = duration    

    def getCourseName(self):
        return self.__courseName
    
    def getDuration(self):
        return self.__duration
    


class Student :

    def __init__(self , name , age , rollNumber) -> None:
        self.__name = name
        self.__age = age 
        self.__rollNumber = rollNumber
        self.__myCourses = []

    def setName(self , name) :
        self.name = name     
    def setAge(self , age) :
        self.age = age    
    def setRollNumber(self , rollNumber) :
        self.rollNumber = rollNumber   
        
    def getName(self):
        return self.name
    def getAge(self):
        return self.age
    def getRollNumber(self):
        return self.rollNumber
    
    def addCourses(self , course):
        self.__myCourses.append(course)

    def enrolledCourses(self):
        for i in self.__myCourses : print(f"course {i.getCourseName()}  {i.getDuration()}" ) 



student1 = Student("khalifa" , "20" , 3)
student2 = Student("Mo" , "21" , 2)

course1 = Course("AI" , 2) 
course2 = Course("Data Scince" , 3) 
course3 = Course("machine learning" , 2) 
course4 = Course("deep learning" , 3) 

student1.addCourses(course1)
student1.addCourses(course2)
student1.addCourses(course3)
student1.addCourses(course4)
student1.enrolledCourses()

print("." * 120)

student2.addCourses(course1)
student2.addCourses(course2)
student2.enrolledCourses()







