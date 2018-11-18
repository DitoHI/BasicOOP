package com.example.oop;

// example of extends abstract class
//public class Rectangle extends Shape {

// example of implement interface
public class Rectangle implements Shape {
    public Rectangle() {}

    @Override
    public void draw() {
        System.out.println("Rectangle drawn");
    }
}
