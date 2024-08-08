package org.example.creational.abstract_factory;

import org.example.creational.abstract_factory.factr.GUIFactory;
import org.example.creational.abstract_factory.factr.MacOSFactory;
import org.example.creational.abstract_factory.factr.WindowsFactory;

public class Main {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
