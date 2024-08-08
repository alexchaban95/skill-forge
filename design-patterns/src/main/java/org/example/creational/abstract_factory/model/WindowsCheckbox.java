package org.example.creational.abstract_factory.model;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created a WindowsCheckbox.");
    }
}
