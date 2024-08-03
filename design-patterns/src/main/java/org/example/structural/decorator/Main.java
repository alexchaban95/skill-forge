package org.example.structural.decorator;

import org.example.structural.decorator.dec.BoldTextDecorator;
import org.example.structural.decorator.dec.ItalicTextDecorator;
import org.example.structural.decorator.model.PlainText;
import org.example.structural.decorator.model.Text;

public class Main {
    public static void main(String[] args) {
        Text plainText = new PlainText("Hello, World!");

        Text boldText = new BoldTextDecorator(plainText);
        System.out.println(boldText.getContent());

        Text italicText = new ItalicTextDecorator(plainText);
        System.out.println(italicText.getContent());

        Text boldItalicText = new BoldTextDecorator(new ItalicTextDecorator(plainText));
        System.out.println(boldItalicText.getContent());
    }
}
