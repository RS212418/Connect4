package com.company;

public class Main {

    static String[][] table = new String[7][6];
    private static int x;
    private static int y;

    public static void main(String[] args) {
        table();
        tablePrint();
    }

    private static void table() {
        for (int x = 0; x < 7; x++) {
            for (int y = 0; y < 6; y++) {
                table[x][y] = "[  ]";
                //this creates the board in a 7 x 6 format
            }
        }
    }
    private static void tablePrint() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <6; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println("");
            //uses for loops to print the 7 x 6 board
        }
    }

}
