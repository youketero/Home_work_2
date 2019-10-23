package com.epam.task3;

public class Task3 {
    public static void main(String[] args) {
        int line = 1;
        while (line <= 6){
            int row = 6;
            while (row > 1){
                if(row > line){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
                row--;
            }
            System.out.println();
            line++;
        }
    }
}
