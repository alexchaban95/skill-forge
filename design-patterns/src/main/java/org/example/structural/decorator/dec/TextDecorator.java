package org.example.structural.decorator.dec;

import org.example.structural.decorator.model.Text;

public abstract class TextDecorator implements Text {
    protected Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String getContent() {
        return text.getContent();
    }
}
