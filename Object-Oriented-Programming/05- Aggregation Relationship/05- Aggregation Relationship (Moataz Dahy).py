# Author : Moataz Dahy

class University:
    def __init__(self, name):
        self.__name = name
        self.__departments = []

    def add_department(self, department):
        self.__departments.append(department)

    def display_departments(self):
        print("University Name:", self.__name)
        for department in self.__departments:
            print("Department Name:", department.get_name())
            print("Location:", department.get_location())
            print("Head of Department:", department.get_head_of_department())
            print()
class Department:
    def __init__(self, name='', location='', head_of_department=''):
        self.__name = name
        self.__location = location
        self.__head_of_department = head_of_department

    def set_name(self, name):
        self.__name = name

    def get_name(self):
        return self.__name

    def set_location(self, location):
        self.__location = location

    def get_location(self):
        return self.__location

    def set_head_of_department(self, head_of_department):
        self.__head_of_department = head_of_department

    def get_head_of_department(self):
        return self.__head_of_department


D1 = Department("IT", "Building 1", "Dr. Walid Khalaf")
D2 = Department('Business', 'Building 2', 'Dr. Mohamed Ahmed')

U1 = University("EELU")
U1.add_department(D1)
U1.add_department(D2)

U1.display_departments()
