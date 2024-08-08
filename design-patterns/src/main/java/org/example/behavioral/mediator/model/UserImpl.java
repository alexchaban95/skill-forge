package org.example.behavioral.mediator.model;

import org.example.behavioral.mediator.mediat.ChatMediator;

public class UserImpl extends User {
    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " send message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " receive message: " + message);
    }
}
