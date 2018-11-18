package com.example.oop;

public class Main {
    public static void main(String[] args) {
//        Vehicle vehicle1 = new Vehicle();
//        vehicle1.setName("Civic");
//        System.out.println(vehicle1.count);
//
//        Vehicle vehicle2 = new Vehicle("Jazz", "White", "Car", "Honda", "800");
//        System.out.println(vehicle2.getSpeed());
//        System.out.println(vehicle1.getName());
//        System.out.println(vehicle2.count);
//
//        System.out.println(Vehicle.getVehicle());

//        Car car1 = new Car("Civic", "Black", "2012", "Honda", "900", true, false);
//        System.out.println(car1.isLedScreen());
//        System.out.println(car1.getName());

        Vehicle vehicle1 = new Vehicle("Jazz", "White", "Car", "Honda", "900");
        System.out.println(vehicle1.getInfo());

        // example of Polymorphism
        Vehicle vehicle2 = new Car("Jazz", "White", "Car", "Honda", "900", true, false);
        System.out.println((vehicle2).getName());
        Vehicle vehicle3 = new Bike("Dito", "White", "Car", "Honda", "900", true);
        System.out.println((vehicle3).getName());

        // example of Abstraction
        Shape shape1 = new Rectangle();
        shape1.draw();
    }
}
