package org.example.structural.composite;

public class Main {
    public static void main(String[] args) {
        Component button1 = new Button("Submit");
        Component button2 = new Button("Cancel");
        Component textField = new TextField("Enter your name");

        Panel panel = new Panel();
        panel.add(button1);
        panel.add(button2);
        panel.add(textField);

        Panel mainPanel = new Panel();
        mainPanel.add(panel);

        mainPanel.render();
    }
}
