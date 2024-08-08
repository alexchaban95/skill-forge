package org.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Panel implements Component {
    private List<Component> components = new ArrayList<>();

    @Override
    public void render() {
        System.out.println("Rendering Panel:");
        for (Component component : components) {
            component.render();
        }
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return components.get(index);
    }
}
