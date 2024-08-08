package org.example.behavioral.visitor;

import org.example.behavioral.visitor.model.Document;
import org.example.behavioral.visitor.model.PDFDocument;
import org.example.behavioral.visitor.model.WordDocument;
import org.example.behavioral.visitor.visit.DocumentVisitor;
import org.example.behavioral.visitor.visit.PrintVisitor;
import org.example.behavioral.visitor.visit.SaveVisitor;

public class Main {
    public static void main(String[] args) {
        Document pdf = new PDFDocument("PDF Content");
        Document word = new WordDocument("Word Content");

        DocumentVisitor printVisitor = new PrintVisitor();
        DocumentVisitor saveVisitor = new SaveVisitor();

        pdf.accept(printVisitor);
        word.accept(printVisitor);

        pdf.accept(saveVisitor);
        word.accept(saveVisitor);
    }
}
