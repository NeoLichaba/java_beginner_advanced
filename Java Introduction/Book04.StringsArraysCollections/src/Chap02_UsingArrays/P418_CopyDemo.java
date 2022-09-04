/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chap02_UsingArrays;

import java.util.Arrays;

/* Program displays copying elements from an existing array into a new array
 * Methods stem from the Array class
 * 
 */
public class P418_CopyDemo {

    public static void main(String args[]) {
        int arrayOriginal[] = {42, 55, 21};
        int arrayNew[]
                = Arrays.copyOf(arrayOriginal, 3); //→9
        printIntArray(arrayNew);
        //int arrayNew[] = Arrays.copyOf(arrayOriginal, 2);                     arrayNew will have fewer elements
        //int arrayNew[] = Arrays.copyOf(arrayOriginal, 8);                     arrayNew has more elements
        //int arrayOriginal[] = {42, 55, 21, 16, 100, 88};                      
        //int arrayNew[] = Arrays.copyOfRange(arrayOriginal, 2, 5);             Making use of copyOfRange; passing parameters - 2 inclusive, 5 exclusive
    }

    static void printIntArray(int arrayNew[]) {
        for (int i : arrayNew) {
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println();
    }
}


