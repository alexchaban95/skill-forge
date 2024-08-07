package org.example.structural.flyweight.model;

public class TreeInstance {
    private int x;
    private int y;
    private Tree treeType;

    public TreeInstance(int x, int y, Tree treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void display() {
        treeType.display(x, y);
    }
}
