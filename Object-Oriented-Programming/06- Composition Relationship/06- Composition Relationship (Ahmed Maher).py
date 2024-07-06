class Country : 
    def __init__(self , countryName):
        self.__countryName = countryName
        self.__states = []
    
    def addState(self, newState):
        self.__states.append(newState)
    
    def displayStates(self):
        print(f"Country :: {self.__countryName}")
        for x in self.__states :
            print(f"{x.displayCities()}")

class State :
    def __init__(self , stateName):
        self.__stateName = stateName
        self.__cities = []
    
    def addCity(self, newCity):
        self.__cities.append(newCity)
    
    def getStateName(self):
        return  self.__stateName
    
    def displayCities(self):
        result = f"State -> {self.__stateName}\n"
        for x in self.__cities:
            result += f" city: {x.getCityName()}\n"
        return result.strip()


class City :
    def __init__(self , cityName):
        self.__cityName = cityName
    
    def getCityName(self):
        return self.__cityName
    
    def setCityName(self, cityName):
        self.__cityName = cityName

C1 = City("Munich")
C2 = City("Frankfurt")
C3 = City("Berlin")
C4 = City("Hamburg")

S1 = State("Bavaria")
S1.addCity(C1)
S1.addCity(C2)

S2 = State("Berlin")
S2.addCity(C3)
S2.addCity(C4)

germany = Country("Germany")
germany.addState(S1)
germany.addState(S2)

germany.displayStates()