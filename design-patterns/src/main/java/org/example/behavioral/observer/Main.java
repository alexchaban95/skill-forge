package org.example.behavioral.observer;

import org.example.behavioral.observer.observer.ConcreteObserver1;
import org.example.behavioral.observer.observer.ConcreteObserver2;
import org.example.behavioral.observer.observer.Observer;
import org.example.behavioral.observer.subject.ConcreteSubject;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver1("1");
        Observer observer2 = new ConcreteObserver2("2");

        subject.attach(observer1);
        subject.attach(observer2);

        subject.setState("State #1");
        subject.setState("State #2");

        subject.detach(observer1);
        subject.setState("State #3");
    }
}
