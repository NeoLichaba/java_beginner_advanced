/*
 * 
 */
package Chap02_VariablesDataTypes;

/* Proram sets out to define an enum - a customer variable with a limited set of possible values
 *
 * 
 */
public class EnumTest {

    public enum CardSuit {
        HEARTS, SPADES, CLUBS, DIAMONDS
    }

    public static void main(String[] args) {
        CardSuit suit;                      //variable declared
        suit = CardSuit.HEARTS;             //value assigned using enum name and enum values using dot notation
        System.out.println("The suit is " + suit);
    }
}


