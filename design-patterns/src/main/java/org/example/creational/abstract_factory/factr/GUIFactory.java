package org.example.creational.abstract_factory.factr;

import org.example.creational.abstract_factory.model.Button;
import org.example.creational.abstract_factory.model.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
