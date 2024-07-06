#Author : Moataz Dahy

class County :
  def __init__(self, countyName='') :
    self.__countyName = countyName
    self.__states = []

  def addState(self, stateName) :
    self.__states.append(stateName)

  def displayStates(self) :
    print("County Name :", self.__countyName)
    for state in self.__states :
      state.displayCities()

class State :
  def __init__(self, stateName='') :
    self.__stateName = stateName
    self.__cities = []

  def addCity(self, cityName) :
    self.__cities.append(cityName)

  def displayCities(self) :
    print(" State Name :", self.__stateName)
    for city in self.__cities :
      print("  City Name :", city.get_cityName())

class City :
  def __init__(self, cityName='') :
    self.__cityName = cityName

  def set_cityName(self, cityName) :
    self.__cityName = cityName

  def get_cityName(self) :
    return self.__cityName


county = County('Egypt')

state1 = State('Cairo')

city1 = City('Cairo')
city2 = City('Alex')

state2 = State('Sohag')
city3 = City('Assiut')
city4 = City('Qena')

county.addState(state1)
state1.addCity(city1)
state1.addCity(city2)

county.addState(state2)
state2.addCity(city3)
state2.addCity(city4)

county.displayStates()

