package org.example.behavioral.mediator.mediat;

import org.example.behavioral.mediator.model.User;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.users) {
            // Сообщение не должно быть отправлено пользователю, который его отправил
            if (u != user) {
                u.receive(message);
            }
        }
    }
}
