/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex08_2_exercise;

public class Item {

    String desc;
    int quantity;
    double price;
    char colorCode = 'U';   //'U' = Undetermined

    public void displayItem() {
        System.out.println("Item: " + desc + ", " + quantity + ", "
                + price + ", " + colorCode);
    }

    // Write a public 3-arg setItemDisplay method that returns void.
    public void setItemFields(String desc, int quantity, double price) {
        this.desc = desc;
        this.quantity = quantity;
        this.price = price;
    }

    // // Write a public 4-arg setItemDisplay method that returns an int.
    public int setItemFields(String desc, int quantity, double price, char colorCode) {
        if (colorCode != ' ') {
            this.setItemFields(desc, quantity, price);
            return 1;
        } else {
            return -1;
        }
    }

}
