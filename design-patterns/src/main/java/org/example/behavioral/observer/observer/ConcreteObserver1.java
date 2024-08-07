package org.example.behavioral.observer.observer;

public class ConcreteObserver1 implements Observer {
    private String name;

    public ConcreteObserver1(String name) {
        this.name = name;
    }

    @Override
    public void update(String state) {
        System.out.println("Observer " + name + " received update: " + state);
    }
}