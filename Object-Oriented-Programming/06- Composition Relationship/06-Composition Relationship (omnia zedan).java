//Author:omnia zedan
public class City {
    private String cityName;
    public City(String cityName){
      this.cityName=cityName; 
    }
    public void setcityName(String cityName){
        this.cityName=cityName;
    }
    public String getcityName(){
        return cityName;
    }
}
public class State {
  private  String stateName ;
   private City[]cities;
 public State(String stateName){
     this.stateName=stateName;
     this.cities=new City[1000];
 }
 public void SetstateName(String stateName){
     this.stateName=stateName;
 }
 public String getstateName(){
     return stateName;
 }
    public void addcity( City city){
    int index=0;
    cities[index]=city;
    index++;
  
} 
public void nameOfCity() {
       
        for (int i = 0; i < cities.length; i++) {
            if (cities[i] != null) {
                System.out.println("city Name: " +cities[i].getcityName());
            }}}    
}
public class Country {
private String countryName;
private State[]State;

 public Country(String countryName) {
        this.countryName = countryName;
        this.State = new State[1000];
        
    }
 public void setcountryName(String countryName){
     this.countryName=countryName;
 }
 public String getcountryName(){
     return countryName;
 }
public void addStates( State sta){
    int index=0;
    State[index]=sta;
    index++;
  
}
public void nameOfState() {
        
        for (int i = 0; i < State.length; i++) {
            if (State[i] != null) {
                System.out.println("State Name: " +State[i].getstateName());
            }}}
    public static void main(String[] args) {
       
        Country c=new Country("Egypt");
          State c1=new State("Cairo");
      City c2=new City("Giza");
      c.addStates(c1);
      c1.addcity(c2);
     c.nameOfState();
      c1.nameOfCity();
    }
    
}

  
