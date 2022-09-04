
package Chap01_WorkingWithStrings;

/* Strings are reference types, not value/primitive types
 * Java allows you to assign string literals to string variables
 * Escape sequences
 * Marked by "" 
 * Immutable object - don't change the String itself but returns a new String object with modified value
 * If there is a primitive type used in a concatenation expression, Java converts primitive type to String
 * Primitive wrapper classes (i.e. integer and double) have parse methods that convert string varlues to numeric types
    ** e.g. String s = "50";
            int i = Integer.parseInt(s);
 * Compare string making use of equals method and not equals operator
 * equalsIgnoreCase method compares strings without considering the case
 * trim method removes white-space characters from the start and end of a word
    ** Remember to assign the result of this expression back to the variable (e.g s = s.trim();) otherwise result 
       will be discarded

 * Extracting characters from a string (refer to page 381 example)
   ----------------------------------------------------------------
   * Use charAt method
   * If you specify an index value that's beyond the end of the string, you will get a StringIndexOutOfBoundsException
   * StringIndexOutOfBoundsException = unchecked exception thus no need to enclose the charAt method in a try/catch statememt
 
 * Extracting substrings from a string (refer to page 383 example)
   -----------------------------------------------------------------
   * Substring = a part of a string
   * startIndex is inclusive, endIndex is exclusive
   *  substring method lets you extract a portion of a string. Two forms:
    ** 1: Accepts single parameter 
       e.g public String substring(int startIndex)
    ** 2: Accepts 2 parameters 
       e.g public String substring(int startIndex, int endIndex)
   * NB: String positions start at 0, not 1.
   * Both methods will throw an IndexOutOfBoundsException is either start/endIndex is greater than the length of the String

 * Splitting a String
   ------------------------------------------------------------------
   * Splitting a string based on a delimeter
   * split method requires you to use an array
   * String passed to the split method is used for pattern recognition, called regular expression
     e.g. \\t - tab
          \\n - newline character
          \\| - bar
          \\s - white-space character
          \\s+ - one or more occurrences of any white-space character
            >> especially useful for breaking string into separate words (refer to example on page385)

  * Replacing parts of a string
    -------------------------------------------------------------------
    * Can make use of replaceFirst or replaceAll methods
       e.g public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String s = sc.nextLine();
            s = s.replaceAll("cat", "dog");                                     //replaces all instances of cat with dog
            System.out.println(s);
        }
  * Using StringBuilder and StringBuffer classes 
    -------------------------------------------------------------------
    * StringBuffer safe to use in applications that work with multiple threads
    * StringBuilder not safe for threaded applications but more efficient (refer to example page390)
        >> Can't assign string literals directly to a StringBuilder object vs. a String object
        .e.g StringBuilder sb = new StringBuilder("Today is the day!");
        >> SB class contains a constructor that accepts string as a parameter

 * Using CharSequence Interface
   --------------------------------------------------------------------
   * Implements StringBuilder, StringBuffer and String
   * Created so above 3 can be used interchangeably
   ** Defines four methods
        * char charAt(int): Returns the character at the specified position.
        » int length(): Returns the length of the sequence.
        » subSequence(int start, int end): Returns the substring indicated by the 
          start and end parameters.
        » toString(): Returns a String representation of the sequence
   
*/
public class Notes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
