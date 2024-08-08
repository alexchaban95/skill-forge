package org.example.creational.abstract_factory.factr;

import org.example.creational.abstract_factory.model.Button;
import org.example.creational.abstract_factory.model.Checkbox;
import org.example.creational.abstract_factory.model.MacOSButton;
import org.example.creational.abstract_factory.model.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
