package org.example.structural.composite;

public class TextField implements Component {
    private String value;

    public TextField(String value) {
        this.value = value;
    }

    @Override
    public void render() {
        System.out.println("Rendering TextField with value: " + value);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException();
    }
}
