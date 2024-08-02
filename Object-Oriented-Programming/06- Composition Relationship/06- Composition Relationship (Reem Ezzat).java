// Author: Reem Ezzat

import java.util.ArrayList;


public class SW_Development_Fundamentals {
 

    public static void main(String[] args) {
         Country United_States=new Country("United States");
          State California= new State("California");
          State Texas=new State("Texas");

  United_States.addState(California);
  California.addCity(new City("Los Angeles"));
  California.addCity(new City("San Francisco"));
  California.addCity(new City ("San Diego"));
  
  United_States.addState(Texas);
  Texas.addCity(new City("Austin"));
  Texas.addCity(new City ("Houston"));
  
  United_States.print_states_of_the_country();
        
   California.print_cities_of_the_state();
   Texas.print_cities_of_the_state();

} }
 class Country {
 
  String CountryName;
    ArrayList<State> state ;

  
  Country (String CountryName){
  this.CountryName=CountryName;
  this.state= new ArrayList<State>();

  }

    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    public String getCountryName() {
        return CountryName;
    }
    void addState(State s){
    state.add(s);
    
    }
  void print_states_of_the_country(){
      System.out.println("States of country "+CountryName);
      for(int i=0;i<state.size();i++){
      System.out.println(""+state.get(i).getStateName());}
  }
  
 }
class State{
String StateName;
  ArrayList<City> city ;
State(String StateName){
 this.StateName=StateName;
  this.city= new ArrayList<City>();
}

    public void setStateName(String StateName) {
        this.StateName = StateName;
    }

    public String getStateName() {
        return StateName;
    }


    
    void addCity(City c){
    city.add(c);
    
    }
    
  void print_cities_of_the_state(){
    
System.out.println("\nCities of State "+StateName);
      for(int i=0;i<city.size();i++){
      System.out.println(""+city.get(i).CityName);}
  
    }

}
class City{
String CityName;

City(String CityName){
this.CityName=CityName;

}

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public String getCityName() {
        return CityName;
    }

}