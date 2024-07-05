class City {
  String _cityName;
  City(this._cityName);

  String get cityName => _cityName;

  set cityName(String cityName) {
    this._cityName = cityName;
  }

  void displayDetails() {
    print('City Name: $_cityName');
  }
}

class State {
  String _stateName;
  List<City> _cities = [];

  State(this._stateName);

  void addCityToState(City city) {
    _cities.add(city);
  }

  void displayCities() {
    print('State: $_stateName');
    print('Cities:');
    for (var city in _cities) {
      city.displayDetails();
    }
    print('-----------------------');
  }
}

class Country {
  String _countryName;
  List<State> _states = [];

  Country(this._countryName);

  void addStatesToCountry(State state) {
    _states.add(state);
  }

  void displayStates() {
    print('Country: $_countryName');
    print('States:');
    for (var state in _states) {
      state.displayCities();
    }
  }
}

void main() {
City city1 = City('New York City');
  City city2 = City('London');


  State state1 = State('New York');
  State state2 = State('England');
  
  state1.addCityToState(city1);
  state2.addCityToState(city2);

  Country country = Country('USA');

  country.addStatesToCountry(state1);
  country.addStatesToCountry(state2);

  country.displayStates();
}
