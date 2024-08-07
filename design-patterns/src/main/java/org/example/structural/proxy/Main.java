package org.example.structural.proxy;

import org.example.structural.proxy.model.Image;
import org.example.structural.proxy.model.ProxyImage;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");

        System.out.println("First call to display:");
        image.display();
        System.out.println();

        System.out.println("Second call to display:");
        image.display();
    }
}
