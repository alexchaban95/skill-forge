package org.example.behavioral.iterator;

import org.example.behavioral.iterator.container.NameRepository;

public class Main {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iter = nameRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name: " + name);
        }
    }
}
