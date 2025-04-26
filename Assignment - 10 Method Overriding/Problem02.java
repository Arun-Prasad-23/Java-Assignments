// In Vehicle hierarchy, add methods like start and stop in Vehicle and override them in Child classes.
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }
}
class Car extends Vehicle {
    public void start() {
        System.out.println("Car is starting with a roar");
    }

    public void stop() {
        System.out.println("Car is stopping smoothly");
    }
}
class Bike extends Vehicle {
    public void start() {
        System.out.println("Bike is starting with a vroom");
    }

    public void stop() {
        System.out.println("Bike is stopping quickly");
    }
}
class Truck extends Vehicle {
    public void start() {
        System.out.println("Truck is starting with a rumble");
    }

    public void stop() {
        System.out.println("Truck is stopping with a thud");
    }
}
public class Problem02 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        Vehicle myTruck = new Truck();

        myCar.start();
        myCar.stop();

        myBike.start();
        myBike.stop();

        myTruck.start();
        myTruck.stop();
    }
}