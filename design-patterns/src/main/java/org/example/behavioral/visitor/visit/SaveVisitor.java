package org.example.behavioral.visitor.visit;

import org.example.behavioral.visitor.model.PDFDocument;
import org.example.behavioral.visitor.model.WordDocument;

public class SaveVisitor implements DocumentVisitor {
    @Override
    public void visit(PDFDocument pdf) {
        System.out.println("Saving PDF to file: " + pdf.getContent());
    }

    @Override
    public void visit(WordDocument word) {
        System.out.println("Saving Word to file: " + word.getContent());
    }
}
