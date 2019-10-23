package com.epam.task2;

public class Task2 {

    public static void main(String[] args) {
        int line = 1;
        while (line <= 6){
            int row = 1;
            while (row < 6){
                if(row < line){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
                row++;
            }
            System.out.println();
            line++;
        }

    }
}
