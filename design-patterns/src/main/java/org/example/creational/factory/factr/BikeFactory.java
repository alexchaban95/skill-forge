package org.example.creational.factory.factr;

import org.example.creational.factory.model.Bike;
import org.example.creational.factory.model.Transport;

public class BikeFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Bike();
    }
}
