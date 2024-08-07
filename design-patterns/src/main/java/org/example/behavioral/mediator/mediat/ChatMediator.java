package org.example.behavioral.mediator.mediat;

import org.example.behavioral.mediator.model.User;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
