package factory;

interface Vehicle {
 void ride();
}
class Car implements Vehicle {
 public void ride() {
     System.out.println("Riding a car.");
 }
}

class Bike implements Vehicle {
 public void ride() {
     System.out.println("Riding a bike.");
 }
}

class Scooter implements Vehicle {
 public void ride() {
     System.out.println("Riding a scooter.");
 }
}

abstract class VehicleFactory {
 public abstract Vehicle createVehicle();
}

class CarFactory extends VehicleFactory {
 public Vehicle createVehicle() {
     return new Car();
 }
}

class BikeFactory extends VehicleFactory {
 public Vehicle createVehicle() {
     return new Bike();
 }
}


class ScooterFactory extends VehicleFactory {

 public Vehicle createVehicle() {
     return new Scooter();
 }
}
