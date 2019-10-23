package com.epam.task4;

public class Task4 {
    public static void main(String[] args) {
        int line = 1;
        while (line <= 12) {
            int row = 12;
            if(line<=6) {
                while (row > 1) {
                    if (row > line) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                    row--;
                }
            }else{
                row = 1;
                while (row < 12) {
                    if (row > line) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    row++;
                }
            }
            System.out.println();
            line++;
        }
    }
}