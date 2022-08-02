/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex10_2_exercise;

public class Order {

    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Order(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }

    public String getDiscount() {
        return Double.toString(discount) + "%";
    }

    // Code the calcDiscount method.
    public void calcDiscount() {
        if (custType == NONPROFIT) {
            if (total > 900) {
                discount = 10.00;
            } else {
                discount = 5.00;
            }
        } else if (custType == PRIVATE) {
            if (total > 900) {
                discount = 7.00;
            } else {
                discount = 0;
            }
        } else if (custType == CORP) {
            if (total < 500) {
                discount = 8.00;
            } else {
                discount = 5.00;
            }

        }
    }
}