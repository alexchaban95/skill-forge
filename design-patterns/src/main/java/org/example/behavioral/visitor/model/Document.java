package org.example.behavioral.visitor.model;

import org.example.behavioral.visitor.visit.DocumentVisitor;

public interface Document {
    void accept(DocumentVisitor visitor);
}
