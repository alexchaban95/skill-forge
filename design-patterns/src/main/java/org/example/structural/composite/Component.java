package org.example.structural.composite;

public interface Component {
    void render();

    void add(Component component);

    void remove(Component component);

    Component getChild(int index);
}
