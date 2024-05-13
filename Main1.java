
// Abstraction: Abstract class for Automobile
abstract class Automobile {
    String make;
    String model;

    public Automobile(String make, String model) {
        this.make = make;
        this.model = model;
    }

    abstract void start();

    abstract void stop();
}

// Encapsulation: Car class encapsulating details
class Car extends Automobile {
    String fuelType;
    boolean engineRunning;

    public Car(String make, String model, String fuelType) {
        super(make, model);
        this.fuelType = fuelType;
        this.engineRunning = false;
    }

    @Override
    void start() {
        if (!engineRunning) {
            System.out.println("Starting the " + make + " " + model + "'s " + fuelType + " engine.");
            engineRunning = true;
        } else {
            System.out.println("Engine is already running.");
        }
    }

    @Override
    void stop() {
        if (engineRunning) {
            System.out.println("Stopping the " + make + " " + model + "'s engine.");
            engineRunning = false;
        } else {
            System.out.println("Engine is already stopped.");
        }
    }
}

// Polymorphism: ServiceStation handling different types of automobiles
class ServiceStation {
    void service(Automobile automobile) {
        System.out.println("Servicing " + automobile.make + " " + automobile.model);
        automobile.start();
        // Additional service tasks can be added here
        automobile.stop();
    }
}

// Inheritance: Motorcycle class inheriting from Automobile
class Motorcycle extends Automobile {
    public Motorcycle(String make, String model) {
        super(make, model);
    }

    @Override
    void start() {
        System.out.println("Starting the " + make + " " + model + "'s engine with a kickstart.");
    }

    @Override
    void stop() {
        System.out.println("Stopping the " + make + " " + model + "'s engine.");
    }
}

// Example Usage
public class Main1 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", "Petrol");
        Motorcycle motorcycle1 = new Motorcycle("Harley-Davidson", "Sportster");

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.service(car1);
        serviceStation.service(motorcycle1);
    }
}