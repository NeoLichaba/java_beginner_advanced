/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex08_01_exercise;

public class Item {

    char color;

    // declare and code the setColor method using if/else statement
    public boolean setColor(char colorCode) {
        if (colorCode == ' ') {
            return false;
        } else {
            this.color = colorCode;
            return true;
        }
    }

}

