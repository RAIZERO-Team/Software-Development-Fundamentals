//Author: basmala mohamed

class Vehicle {
    String brand;
    String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    int numberofDoors;

    public Car(String brand, String model, int Doors) {
        super(brand, model);
        this.numberofDoors = Doors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberofDoors);
    }
}

class Bike extends Vehicle {
    int numberofGears;

    public Bike(String brand, String model, int Gears) {
        super(brand, model);
        this.numberofGears = Gears;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Gears: " + numberofGears);
    }
}

public class OOP {
    public static void main(String[] args) {
        Car c = new Car("Car", "Car", 4);
        Bike b = new Bike("Bike", "Bike", 2);
        
        System.out.println("CAR");
        c.displayInfo();
        System.out.println("BIKE");
        b.displayInfo();
    }
}