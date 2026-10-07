class Vehicle {
    Vehicle(String brand) {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    Car() {
        // Explicitly calling parent's parameterized constructor
        super("Ford"); 
        System.out.println("Car constructor executed.");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Car myCar = new Car();
    }
}
 


 