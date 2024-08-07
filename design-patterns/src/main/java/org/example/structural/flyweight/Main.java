package org.example.structural.flyweight;

import org.example.structural.flyweight.model.Tree;
import org.example.structural.flyweight.model.TreeInstance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TreeInstance> forest = new ArrayList<>();

        Tree treeType1 = TreeFactory.getTreeType("Oak", "Green", "Rough");
        Tree treeType2 = TreeFactory.getTreeType("Pine", "Green", "Smooth");

        forest.add(new TreeInstance(1, 2, treeType1));
        forest.add(new TreeInstance(3, 4, treeType1));
        forest.add(new TreeInstance(5, 6, treeType2));
        forest.add(new TreeInstance(7, 8, treeType2));

        for (TreeInstance tree : forest) {
            tree.display();
        }
    }
}
