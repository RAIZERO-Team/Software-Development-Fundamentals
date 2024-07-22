// Author : omnia zedan
public class Vehicle{


 private String model;
    private String brand;

    public Vehicle(String model, String brand) {
        this.brand = brand;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public void displayInfo() {
        System.out.println("Model: " + this.model);
        System.out.println("Brand: " + this.brand);
    }



    public static void main(String[] args) {
        Car car = new Car("Corolla", "Toyota", 4);
        car.displayInfo();

        var bike = new Bike("CBR", "Honda", 6);
        bike.displayInfo();
    }
    
   
}
 class Car extends Vehicle{
    private int numDoors;

    public Car(String model, String brand, int numDoors) {
        super(model, brand);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + this.numDoors);
    }
}
 class Bike extends Vehicle {
    private int numGears;

    public Bike(String model, String brand, int numGears) {
        super(model, brand);
        this.numGears = numGears;
    }

    @Override
    public void displayInfo() {
     super.displayInfo();
        System.out.println("Number of Gears: " + this.numGears);
    }
}
