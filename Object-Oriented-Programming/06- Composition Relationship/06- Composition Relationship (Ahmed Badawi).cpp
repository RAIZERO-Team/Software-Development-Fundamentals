#include <iostream>
#include <vector>
using namespace std;

class City {
  string cityName;

public:
  City() : cityName("") {}

  City(string cityName) : cityName(cityName) {}

  string getCityName(){
    return cityName;
  }

  void setCityName(string cityName) {
    this -> cityName = cityName;
  }

  void printCitydetails() {
    cout << "City Name: " << cityName << "\n";
  }
};

class State {
  string stateName;
  vector<City*> cities;

public:
  State() : stateName(""){}

  State(string stateName) : stateName(stateName) {}

  string getStateName(){
    return stateName;
  }

  void setStateName(string stateName){
    this -> stateName = stateName;
  }

  void addCity(City* city){
    cities.push_back(city);
  }

  void displayCity(){
    for (const auto& city : cities) {
        city->printCitydetails();
    }
  }

  void printStateDetails(){
      cout << "State Name: " << stateName << "\n";
      displayCity();
  }
};

class Country {
  string countryName;
  vector<State*> states;

public:
  Country() : countryName(""){}

  Country(string countryName) : countryName(countryName) {}

  string getCountryName() {
    return countryName;
  }

  void setCountryName(string countryName) {
    this->countryName = countryName;
  }

  void addState(State* state){
    states.push_back(state);
  }

  void displayCountry(){
    cout << "Country: " << countryName << "\n";
    for (const auto& state : states) {
        state->printStateDetails();
    }
  }
};

int main(){
  City city1, city2;
  city1.setCityName("Ziad");
  city2.setCityName("Al Amara");

  State state1("Cairo");
  State state2("Sohag");

  state1.addCity(&city1);
  state2.addCity(&city2);

  Country country("Egypt");

  country.addState(&state1);
  country.addState(&state2);

  country.displayCountry();

  return 0;
}