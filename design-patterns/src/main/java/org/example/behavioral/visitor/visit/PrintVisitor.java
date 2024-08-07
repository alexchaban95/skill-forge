package org.example.behavioral.visitor.visit;

import org.example.behavioral.visitor.model.PDFDocument;
import org.example.behavioral.visitor.model.WordDocument;

public class PrintVisitor implements DocumentVisitor {
    @Override
    public void visit(PDFDocument pdf) {
        System.out.println("Printing PDF: " + pdf.getContent());
    }

    @Override
    public void visit(WordDocument word) {
        System.out.println("Printing Word: " + word.getContent());
    }
}
