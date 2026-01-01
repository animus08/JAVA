import java.util.*;

abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car started.");
    }
    void stop() {
        System.out.println("Car stopped.");
    }
}

class Motorcycle extends Vehicle {
    void start() {
        System.out.println("Motorcycle started.");
    }
    void stop() {
        System.out.println("Motorcycle stopped.");
    }
}

class Driver {
    List<Vehicle> vehicles = new ArrayList<>();
    void addVehicle(Vehicle v) { vehicles.add(v); }
    void startAllVehicles() { for (Vehicle v : vehicles) v.start(); }
    void stopAllVehicles() { for (Vehicle v : vehicles) v.stop(); }
}

public class VehicleAbstract {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        driver.addVehicle(car);
        driver.addVehicle(motorcycle);
        driver.startAllVehicles();
        driver.stopAllVehicles();
    }
}
