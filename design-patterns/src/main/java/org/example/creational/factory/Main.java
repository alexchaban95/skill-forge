package org.example.creational.factory;

import org.example.creational.factory.factr.BikeFactory;
import org.example.creational.factory.factr.CarFactory;
import org.example.creational.factory.factr.TransportFactory;

public class Main {

    public static void main(String[] args) {
        TransportFactory factory1 = new CarFactory();
        TransportFactory factory2 = new BikeFactory();

        factory1.deliverPackage();
        factory2.deliverPackage();
    }
}
