package org.example.behavioral.visitor.model;

import org.example.behavioral.visitor.visit.DocumentVisitor;

public class PDFDocument implements Document {
    private String content;

    public PDFDocument(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
