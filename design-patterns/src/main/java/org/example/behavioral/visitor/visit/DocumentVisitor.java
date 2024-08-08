package org.example.behavioral.visitor.visit;

import org.example.behavioral.visitor.model.PDFDocument;
import org.example.behavioral.visitor.model.WordDocument;

public interface DocumentVisitor {
    void visit(PDFDocument pdf);
    void visit(WordDocument word);
}
