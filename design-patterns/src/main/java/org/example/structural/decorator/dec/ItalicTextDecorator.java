package org.example.structural.decorator.dec;

import org.example.structural.decorator.model.Text;

public class ItalicTextDecorator extends TextDecorator {
    public ItalicTextDecorator(Text text) {
        super(text);
    }

    @Override
    public String getContent() {
        return "<i>" + text.getContent() + "</i>";
    }
}
