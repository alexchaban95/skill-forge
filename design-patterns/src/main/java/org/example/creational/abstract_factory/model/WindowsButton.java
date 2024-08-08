package org.example.creational.abstract_factory.model;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created a WindowsButton.");
    }
}
