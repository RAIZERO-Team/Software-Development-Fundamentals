//Author: Shahd Mahmoud 

package task10oop;


public class Task10oop {

    public static void main(String[] args) {
        Car c1= new Car("Toyota","Camry",4);
        Bike b1=new Bike("Trek","Marlin 7",21);
        c1.displayInfo();
        b1.displayInfo();
    }
    
}
class Vehicle {
     String brand;
     String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}
class Car extends Vehicle{
    int numDoors;

    public Car(String brand,String model,int numDoors) {
        super(brand, model);
        this.numDoors = numDoors;
    }
    @Override
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Number of Doors: " + numDoors);
    }
}
class Bike extends Vehicle{
int numGears;
public Bike(String brand,String model,int numGears) {
        super(brand, model);
        this.numGears = numGears;
    }
@Override
    public void displayInfo() {
        System.out.println(" Brand: " + brand + ", Model: " + model + ", Number of Gears: " + numGears);
    }
}