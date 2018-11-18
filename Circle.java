package com.example.oop;

// example of extends abstract class
//public class Circle extends Shape {

// example of implements interface
public class Circle implements Shape {
    public Circle() {}

    @Override
    public void draw() {
        System.out.println("Circle drawn");
    }
}
