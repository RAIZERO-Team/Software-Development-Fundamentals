# Author : Moataz Dahy

class Person:
    def __init__(self, name='', age=0):
        self.__name = name
        self.__age = age

    def display_info(self):
        print(f"Name : {self.__name}")
        print(f"Age : {self.__age}")


class Worker:
    def __init__(self, worker_id=0, role=''):
        self.__worker_id = worker_id
        self.__role = role

    def display_info(self):
        print(f"Worker ID : {self.__worker_id}")
        print(f"The Role : {self.__role}")


class Employee(Person, Worker):
    def __init__(self, name, age, worker_id, role,  employee_id=0, department=''):
        Person.__init__(self, name, age)
        Worker.__init__(self, worker_id, role)
        self.__employee_id = employee_id
        self.__department = department

    def display_info(self):
        Person.display_info(self)
        Worker.display_info(self)
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


M = Employee('Zizo', 20, 25205, 'developer', 5, 'Devlopment')

E = Employee('Abdo', 25, 25250, 'engineer', 15, 'Machine learning')

print("The Info Of Manager :")
M.display_info()

print()

print("The Info Of Engineer :")
E.display_info()

