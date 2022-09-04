
package Chap02_UsingArrays;

/* Understanding Arrays
   --------------------

    % Array = set of variables that is references by using a variable + index number
    % Elements = item within an array
    % An array is itself an object. Thus, if x[5]refers to an element of an array, x refers to the array itself.
    % An array has a fixed length that’s set when the array is created. This length 
      determines the number of elements that can be stored in the array. The maximum index value you can use with any array 
      is one less than the array’s length. 
    % You can’t change the length of an array after you create the array.
    % You can access the length of an array by using the length field of the array 
      variable. x.length, for example, returns the length of the array x

   Creating Arrays
    % Variable declaration - indicates type of elements stored by the array
      e.g String [] names, OR String names[]; - variable names, type is an array of String objects; brackets can also
          be placed by the variable name
    % Can create in the following ways:
        - Use new keyword
            - names = new String[10]; - array holds 10 Strings
        - Combine declaration and creation in one statement
            - String [] names = new String [10]; 

 * Initializing an Array
   -----------------------------
    % Shorthand - Create an array and initialise it with constant values
        - e.g. String [] days = {Mon, Tues, Wed, Thurs, Fri, Sat, Sun}
            - Each element assigned to the array is listed in an array initializer
            - Length of the array initializer is determined by the number of values listed in the initializer

 * Using for Loops with Arrays
   ------------------------------
    % Used to process an array
      - Fill an array with names
      e.g. String[] players = new String[count];
            for (int i = 0; i < count; i++)
        {
            System.out.print("Enter player name: ");
            players[i] = sc.nextLine(); // sc is a Scanner
        }

      - Prints contents of an array
      e.g. for (int i = 0; i < count; i++)
            System.out.println(players[i]);
     
      - Obtain length of an array using the length property
        e.g. for (int i = 0; i < players.length; i++)
                System.out.println(players[i])
 *
 */
public class Notes {
    
}
