package com.kraftwerking.datastructuresalgo.codinggame;

import java.util.*;
import java.io.*;
import java.math.*;

public class TheDescent {
    /**
     * The while loop represents the game.
     * Each iteration represents a turn of the game
     * where you are given inputs (the heights of the mountains)
     * and where you have to print an output (the index of the mountain to fire on)
     * The inputs you are given are automatically updated according to your last actions.
     **/
    class Player {

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);

            // game loop
            while (true) {
                List<Integer> arr = new ArrayList<>();

                for (int i = 0; i < 8; i++) {
                    int mountainH = in.nextInt(); // represents the height of one mountain.
                    arr.add(mountainH);
                }

                // Write an action using System.out.println()
                // To debug: System.err.println("Debug messages...");
                int max = Collections.max(arr);
                System.out.println(arr.indexOf(max)); // The index of the mountain to fire on.
            }
        }
    }
}
