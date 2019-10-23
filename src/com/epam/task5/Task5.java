package com.epam.task5;

public class Task5 {
    public static void main(String[] args) {
        int line = 1;
        while (line <= 11) {
            int row = 6;
            if (line <= 6) {
                while (row > 1) {
                    if (row > line) {
                        System.out.print(" ");
                    } else {
                        System.out.print(" *");
                    }
                    row--;
                }
            } else {
                while (row > 1) {
                    if ((row+5) > line) {
                        System.out.print(" ");
                    } else {
                        System.out.print(" *");
                    }
                    row--;

                }
            }
            System.out.println();
            line++;
        }
    }
}
