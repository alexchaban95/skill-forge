package org.example.behavioral.mediator;

import org.example.behavioral.mediator.mediat.ChatMediator;
import org.example.behavioral.mediator.mediat.ChatMediatorImpl;
import org.example.behavioral.mediator.model.User;
import org.example.behavioral.mediator.model.UserImpl;

public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "Alice");
        User user2 = new UserImpl(mediator, "Bob");
        User user3 = new UserImpl(mediator, "Charlie");
        User user4 = new UserImpl(mediator, "David");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hello, everyone!");
        user2.send("Hi, Alice!");
    }
}
