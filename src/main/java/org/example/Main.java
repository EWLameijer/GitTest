package org.example;

public class Main {
    public static void main(String[] args) {
        var text = "Hello GitTest!";
        var blockSize = text.length();
        displaySquare(blockSize);
        System.out.println("Hello GitTest!");
        displaySquare(blockSize);
    }

    private static void displaySquare(int size) {
        for (int row=0; row<size; row++) {
            for (int column = 0; column < size; column++) System.out.print("*");
            System.out.println();
        }
    }
}