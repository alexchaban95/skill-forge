package org.example.creational.factory.model;

public class Car implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by car");
    }
}
