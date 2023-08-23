package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var name = getName();
        var text = "Hello " + name + "!";
        var blockSize = text.length();
        displayRectangle(blockSize, 3);
        System.out.println(text);
        displayRectangle(blockSize, 3);
    }

    private static String getName() {
        System.out.print("Please enter your name: ");
        Scanner in = new Scanner(System.in);
        String name = "";
        do {
            name = in.nextLine();
        } while (name.isBlank());
        return name;
    }

    private static void displayRectangle(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int column = 0; column < width; column++) System.out.print("*");
            System.out.println();
        }
    }
}