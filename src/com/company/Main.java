package com.company;

public class Main {

    public static void main(String[] args) {
        Game8 game8 = new Game8();
        int[][] range = {
                {8, 7, 6},
                {5, 4, 3},
                {0, 2, 1},
        };
        int[][] range2 = {
                {1, 2, 3},
                {8, 7, 6},
                {0, 5, 4},
        };
        int [] rule = {3,1,4,2};
        System.out.println(game8.play(range));
    }
}