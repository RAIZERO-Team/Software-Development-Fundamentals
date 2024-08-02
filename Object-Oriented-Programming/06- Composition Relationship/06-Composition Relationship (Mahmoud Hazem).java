//Author: Mahmoud Hazem

package org.example;
import java.lang.String;
import java.lang.*;

class City {
    private String cityName;
    public City(String cityName){
        this.cityName=cityName;
    }
    public void setCityName(String cityName){
        this.cityName=cityName;
    }
    public String getCityName(){
        return cityName;
    }
}
class State {
    private  String stateName ;
    private final City[]cities;
    public State(String stateName){
        this.stateName=stateName;
        this.cities=new City[1000];
    }
    public void setStateName(String stateName){
        this.stateName=stateName;
    }
    public String getStateName(){
        return stateName;
    }
    public void addCity( City city){
        int index=0;
        cities[index]=city;
        index++;

    }
    public void nameOfCity() {

        for (int i = 0; i < cities.length; i++) {
            if (cities[i] != null) {
                System.out.println("city Name: " +cities[i].getCityName());
            }}}
}
class Country {
    private String countryName;
    private final State[] State;

    public Country(String countryName) {
        this.countryName = countryName;
        this.State = new State[1000];

    }
    public void setCountryName(String countryName){
        this.countryName=countryName;
    }
    public String getCountryName(){
        return countryName;
    }
    public void addStates( State state){
        int i=0;
        State[i] = state;
        i++; 

    }
    public void nameOfState() {

        for (int i = 0; i < State.length; i++) {
            if (State[i] != null) {
                System.out.println("State Name : " +State[i].getStateName());
            }}}

    public static void main (String[]args){
        Country c1=new Country("France");
        State c2=new State("Paris");
        City c3=new City("Monaco");
        
        c1.addStates(c2);
        c2.addCity(c3);
        c1.nameOfState();
        c2.nameOfCity();
    }
}