package org.example.creational.factory.factr;

import org.example.creational.factory.model.Car;
import org.example.creational.factory.model.Transport;

public class CarFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Car();
    }
}
