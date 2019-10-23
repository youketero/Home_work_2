package com.epam.task1;

public class Task1 {

    public static void main(String[] args) {
        int line = 1;
        while (line <= 16){
            int row = 1;
            if (line<=8){
                while (row <= line){
                    System.out.print("*");
                    row++;
                }
            }else {
                row = 16;
                while (row > line){
                    System.out.print("*");
                    row--;
                }
            }
            System.out.println();
            line++;
        }
    }
}
