# Author : Moataz Dahy

class Person:
    def __init__(self, name='', age=0):
        self.__name = name
        self.__age = age

    def display_info(self):
        print(f"Name : {self.__name}")
        print(f"Age : {self.__age}")


class Employee(Person):
    def __init__(self, name, age, employee_id=0, department=''):
        Person.__init__(self, name, age)
        self.__employee_id = employee_id
        self.__department = department

    def display_info(self):
        Person.display_info(self)
        print(f"Employee ID : {self.__employee_id}")
        print(f"The Department : {self.__department}")

    def show_department(self):
        print(f"The Department : {self.__department}")


class Manager(Employee):
    def __init__(self, name, age, employee_id, department, num_teams=0):
        Employee.__init__(self, name, age, employee_id, department)
        self.__num_team = num_teams

    def display_info(self):
        Employee.display_info(self)
        print(f"Number Teams : {self.__num_team}")

    def show_teams(self):
        print(f"Number Teams: {self.__num_team}")


class Engineer(Manager):
    def __init__(self, name, age, employee_id, department, num_teams, specialization=''):
        Manager.__init__(self, name, age, employee_id, department, num_teams)
        self.__specialization = specialization

    def display_info(self):
        Manager.display_info(self)
        print(f"Specialization : {self.__specialization}")

    def show_specialization(self):
        print(f"Specialization : {self.__specialization}")


M = Manager('Zizo', 25, 21015, 'cairo', 5)

E = Engineer('Abdo', 20, 202015, 'sohag', 14, 'IT')

print("The Info Of Manager :")
M.display_info()

print()

print("The Info Of Engineer :")
E.display_info()


