package org.example.creational.abstract_factory.factr;

import org.example.creational.abstract_factory.model.Button;
import org.example.creational.abstract_factory.model.Checkbox;
import org.example.creational.abstract_factory.model.WindowsButton;
import org.example.creational.abstract_factory.model.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
