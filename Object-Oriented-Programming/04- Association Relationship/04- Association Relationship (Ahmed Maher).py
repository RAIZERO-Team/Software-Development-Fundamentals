# Author: Ahmed Maher


class Student:
    def __init__(self, name="", age=0, rollNumber=0):
        self.__name = name
        self.__age = age
        self.__rollNumber = rollNumber
        self.__courses = []
    
    def setName(self, newName):
        self.__name = newName
    
    def getName(self):
        return self.__name
    
    def getAge(self):
        return self.__age
    
    def setAge(self, newAge):
        self.__age = newAge
    
    def getRollNumber(self):
        return self.__rollNumber
    
    def setRollNumber(self, rollNumber):
        self.__rollNumber = rollNumber
    
    def addCourses(self, course):
        self.__courses.append(course)
    
    def list_courses(self):
        return [{'course Name': course.getCourseName(), 'duration': course.getDuration()} for course in self.__courses]

class Course:
    def __init__(self, courseName, duration):
        self.__courseName = courseName
        self.__duration = duration
    
    def getCourseName(self):
        return self.__courseName
    
    def setCourseName(self, courseName):
        self.__courseName = courseName
    
    def getDuration(self):
        return self.__duration
    
    def setDuration(self, duration):
        self.__duration = duration


S1 = Student("Ma7er", 21, +201012777757)

course1 = Course("AI", 7)
course2 = Course("Linear Algebra", 3)
course3 = Course("Python", 12)

S1.addCourses(course1)
S1.addCourses(course2)
S1.addCourses(course3)

courses_list = S1.list_courses()
print(f"student : {S1.getName()} \nAge : {S1.getAge()} \nRollNumber : {S1.getRollNumber()}\n{S1.getName()}'s courses : \n{courses_list}")
