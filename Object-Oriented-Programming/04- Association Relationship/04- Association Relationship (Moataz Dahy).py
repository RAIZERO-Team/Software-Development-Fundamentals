# Author : Moataz DaHy

class Student :
    def __init__(self, name, age, rollnumber):
        self.name = name
        self.age = age
        self.rollnumber = rollnumber
        self.courses = []

    def set_name(self, name):
        self.name = name

    def get_name(self):
        return self.name

    def set_age(self, age):
        self.age = age

    def get_age(self):
        return self.age

    def set_rollnumber(self, rollnumber):
        self.rollnumber = rollnumber

    def get_rollnumber(self):
        return self.rollnumber

    def add_courses(self, course):
        self.courses.append(course)

    def get_enrolled_courses(self):
        for course in self.courses:
            print(f"Course Name: {course.get_coursename()},Course Duration: {course.get_courseduration()}")

    def get_info(self):
        print("Name :", self.name)
        print("Age :", self.age)
        print("Rollnumber :", self.rollnumber)

class Course:
    def __init__(self, coursename="", courseduration=0):
        self.coursename = coursename
        self.courseduration = courseduration

    def set_coursename(self, coursename):
        self.coursename = coursename

    def get_coursename(self):
        return self.coursename

    def set_courseduration(self, courseduration):
        self.courseduration = courseduration

    def get_courseduration(self):
        return self.courseduration

S1 = Student("zizo", 18, 2)

C1 = Course("Math", 3)
C2 = Course("Probability", 3)
C3 = Course("Machine Learning", 8)
C4 = Course("Python", 6)

S1.add_courses(C1)
S1.add_courses(C2)
S1.add_courses(C3)
S1.add_courses(C4)

S1.get_info()
S1.get_enrolled_courses()



