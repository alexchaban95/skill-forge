package org.example.structural.decorator.dec;

import org.example.structural.decorator.model.Text;

public class BoldTextDecorator extends TextDecorator {
    public BoldTextDecorator(Text text) {
        super(text);
    }

    @Override
    public String getContent() {
        return "<b>" + text.getContent() + "</b>";
    }
}
