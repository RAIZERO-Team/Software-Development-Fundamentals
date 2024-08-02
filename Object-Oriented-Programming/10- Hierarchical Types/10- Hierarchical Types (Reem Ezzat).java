// Author: Reem Ezzat


public class SW_Development_Fundamentals {
 

    public static void main(String[] args) {
       Car car1=new Car("BMW","3 Series",4);
       Bike bike1=new Bike("Yamaha","R15 V4",2);
       car1.displayInfo();
        System.out.println("-------------");
       bike1.displayInfo();
} }
class Vihicle{
String brand;
String model;

    public Vihicle(String brand,String model) {
        this.brand=brand;
        this.model=model;
    }
    
    void displayInfo(){
        System.out.println("Details\nBrand: "+this.brand+
                            "\nModel:"+this.model             
                                               );
    }


}
class Car extends Vihicle{
    int numDoors;

    public Car(String brand,String model,int numDoors) {
        super(brand, model);
        this.numDoors = numDoors;
    }

    @Override
    void displayInfo() {
        System.out.println("Details Of Car"
                         + "\nBrand: "+this.brand+
                            "\nModel:"+this.model+             
                         "\nnumber of doors: "+this.numDoors                  );
    }
    

}
class Bike extends Vihicle{
int numGears;
public Bike(String brand,String model,int numGears) {
        super(brand, model);
        this.numGears = numGears;
    }

    @Override
    void displayInfo() {
        System.out.println("Details of Bike"
                         + "\nBrand: "+this.brand+
                            "\nModel:"+this.model+             
                         "\nnumber of Gears: "+this.numGears                  );
    
}}