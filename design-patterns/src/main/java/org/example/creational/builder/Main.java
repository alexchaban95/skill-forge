package org.example.creational.builder;

public class Main {
    public static void main(String[] args) {
        House houseWithPool = new House.Builder()
                .setFloors(2)
                .setGarage(true)
                .setSwimmingPool(true)
                .build();

        House houseWithoutPool = new House.Builder()
                .setFloors(1)
                .setGarage(false)
                .setSwimmingPool(false)
                .build();

        System.out.println(houseWithPool);
        System.out.println(houseWithoutPool);
    }
}
