package com.example.oop;

public class Car extends Vehicle {
    private boolean powerSteering = false;
    private boolean ledScreen = true;

    public Car(String name, String color, String model, String company, String engine, boolean powerSteering,
               boolean ledScreen) {
        // example of inheritance
        super(name, color, model, company, engine);
        this.powerSteering = powerSteering;
        this.ledScreen = ledScreen;
    }

    // example of override
    public String getName() {
        return "Name of your car is: " + super.getName();
    }

    public boolean isPowerSteering() {
        return powerSteering;
    }

    public void setPowerSteering(boolean powerSteering) {
        this.powerSteering = powerSteering;
    }

    public boolean isLedScreen() {
        return ledScreen;
    }

    public void setLedScreen(boolean ledScreen) {
        this.ledScreen = ledScreen;
    }

    public String getInfo() {
        return "This is a Car";
    }
}
