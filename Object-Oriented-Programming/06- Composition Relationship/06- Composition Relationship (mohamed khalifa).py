class Country :
    def __init__(self , countryName) -> None:
        self.__countryName = countryName
        self.__state = []

    def setCountryName(self ,countryName):
        self.__countryName = countryName

    def addState(self , state):
        self.__state.append(state)

    def getCountryName(self):
        return self.__countryName

    def displayStates(self):
        print(f"{self.__countryName}")
        for i in self.__state :
            print(f"state : {i.getStateName()}")

class State : 
    def __init__(self , stateName) -> None:
        self.__stateName = stateName
        self.__cities = []

    def addCity(self , city):
        self.__cities.append(city)

    def getStateName(self):
        return  self.__stateName

    def displayCities(self):
        print(self.__stateName)
        for i in self.__cities :
            print(f"city {i.getCityName()}")

class City :
    def __init__(self , cityName) -> None:
        self.__cityName = cityName

    def setCityName(self ,cityName):
        self.__cityName = cityName

    def getCityName(self) : 
        return self.__cityName
            


city1 = City("Marseille")
city2 = City("Paris")



state1 = State("Provence-Alpes-Côte d'Azur")
state2 = State("Île-de-France")

state1.addCity(city1)
state2.addCity(city2)

country1 = Country("France")

country1.addState(state1)
country1.addState(state2)

country1.displayStates()
state1.displayCities()
state2.displayCities()






































