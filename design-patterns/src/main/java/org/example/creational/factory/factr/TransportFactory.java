package org.example.creational.factory.factr;

import org.example.creational.factory.model.Transport;

public abstract class TransportFactory {
    public abstract Transport createTransport();

    public void deliverPackage() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
