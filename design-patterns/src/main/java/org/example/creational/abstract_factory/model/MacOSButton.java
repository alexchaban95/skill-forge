package org.example.creational.abstract_factory.model;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created a MacOSButton.");
    }
}
