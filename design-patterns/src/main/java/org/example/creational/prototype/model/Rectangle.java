package org.example.creational.prototype.model;

public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
