package org.example.structural.flyweight;

import org.example.structural.flyweight.model.Tree;
import org.example.structural.flyweight.model.TreeType;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, Tree> treeTypes = new HashMap<>();

    public static Tree getTreeType(String name, String color, String texture) {
        Tree treeType = treeTypes.get(name);

        if (treeType == null) {
            treeType = new TreeType(name, color, texture);
            treeTypes.put(name, treeType);
        }

        return treeType;
    }
}
