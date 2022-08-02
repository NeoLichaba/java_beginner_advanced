package Chap02_Classes;

/* Program displays how one can chain constructors (i.e. constructors calling oner another)
 * Recursive constructor
 * 
 */
public class CrazyClass {

    private String firstString;
    private String secondString;

    public CrazyClass(String first, String second) {
        this(first);
        secondString = second;
    }

    public CrazyClass(String first) {
        this(first, "DEFAULT"); // error: won't compile
    }

}

