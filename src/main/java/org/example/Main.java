package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var name = getName();
        var text = "Hello " + name + "!";
        var blockSize = text.length();
        displaySquare(blockSize);
        System.out.println(text);
        displaySquare(blockSize);
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

    private static void displaySquare(int size) {
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) System.out.print("*");
            System.out.println();
        }
    }
}