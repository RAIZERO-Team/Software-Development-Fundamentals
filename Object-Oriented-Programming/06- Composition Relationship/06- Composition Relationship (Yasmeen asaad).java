package country;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yasmeen asaad
 */
public class Country {
    private String countryName;
    private List<State> states;

    public Country(String countryName) {
        this.countryName = countryName;
        this.states = new ArrayList<>();
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public List<State> getStates() {
        return states;
    }

    public void addState(State s) {
        states.add(s);
    }

    public void displayStates() {
        System.out.println("Country: " + countryName);
        for (int i = 0; i < states.size(); i++) {
            State s = states.get(i);
            s.displayCities();
        }
    }
}

class State {
    private String stateName;
    private List<City> cities;

    public State(String stateName) {
        this.stateName = stateName;
        this.cities = new ArrayList<>();
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateName() {
        return stateName;
    }

    public List<City> getCities() {
        return cities;
    }

    public void addCity(City c) {
        cities.add(c);
    }

    public void displayCities() {
        System.out.println("  State: " + stateName);
        for (int i = 0; i < cities.size(); i++) {
            City c = cities.get(i);
            System.out.println("    City: " + c.getCityName());
        }
    }
}

class City {
    private String cityName;

    public City(String cityName) {
        this.cityName = cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }
}

public class Main {
    public static void main(String[] args) {
        Country c1 = new Country("Egypt");

        State alex = new State("Alexandria");
        alex.addCity(new City("Cairo"));
        alex.addCity(new City("Giza"));

        State sohag = new State("Sohag");
        sohag.addCity(new City("Fayoum"));
        sohag.addCity(new City("Aswan"));

        c1.addState(alex);
        c1.addState(sohag);

        c1.displayStates();
    }
}
