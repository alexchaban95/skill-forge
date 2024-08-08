package org.example.creational.abstract_factory;

import org.example.creational.abstract_factory.factr.GUIFactory;
import org.example.creational.abstract_factory.model.Button;
import org.example.creational.abstract_factory.model.Checkbox;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
