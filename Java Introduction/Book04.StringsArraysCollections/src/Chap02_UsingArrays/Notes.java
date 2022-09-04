
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

 * Using for Loops with Arrays (refer to BoboAndTheLockers example)
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

 * Using the Enhanced for Loop
   ------------------------------------
    % Simplifies loops that process arrays and collections
    % Syntax - for (type identifier : array)
                {
                   Statements ...
               }
               - type = type of elements in the array
               - identifier = local variable used to access each element
               - array - array you want to process
               e.g. String[] days = { "Sunday", "Monday", "Tuesday",
                                      "Wednesday", "Thursday",
                                      "Friday", "Saturday" };
                    for (String day : days)
                    {
                     System.out.println(day);
                    }

 * Using Arrays with Methods
   ----------------------------------------
    % Methods that accept arrays as parameters and returns arrays as return values
    % Creates and returns a String array
    % e.g. public static String[] getDaysOfWeek()
            {
             String[] days = { "Sunday", "Monday", "Tuesday",
             "Wednesday", "Thursday",
             "Friday", "Saturday" };
             return days;
            }  
    % Static method prints contents of Strinf array to the consoler
      e.g. public static void printStringArray(String[] strings)
            {
             for (String s : strings)
             System.out.println(s);
            }
    % Call abovementioned methods
      e.g. String[] days = getDaysOfWeek(); - declares and calls getDaysOfWeek() to create the array
           printStringArray(days); - passes array to printStringArray method

 * Using Two-Dimensional Arrays
   --------------------------------------------
    % Used to track data within a table format (i.e. spreadsheet vibe)
    
    ** Creating two-dimensional array
    -------------------------------------
    % Make use of 2 sets of empty brackets
    % Use new keyword and provide lengths for each set of brackets
    % First set of brackets = rows (x amount of elements)
    % Second set of brackets = columns (Each of those elements has an array of type double with x elements)

    ** Accessing two-dimensional array elements
    ----------------------------------------------
    % Use 2 indexes
    % For loops
    
    ** Initializing 2 dimensional array
    -----------------------------------------------
    % Nest array initializers

    ** Using jagged arrays (refer to Jagged Array example)
    -----------------------------------------------
    % 2D array in which the length of each element of the main array is different

 * Going beyond 2D
   -------------------------------------------------
    % 3D can be created too
    % Nested if statements used to process an array with 3D or more. Initialized a 3D array with number 1-27
    e.g. int[][][] threeD2 = new int[3][3][3];
         int value = 1;
         for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    for (int k = 0; k < 3; k++)
                        threeD2[i][j][k] = value++;

 * Using the Arrays Class
   ---------------------------------------------------
    % Collection of static methods useful for working with arrays
    % Refer to Hand Methods of Arrays Class (p416)
    - Filling an array
        -- fill method evaluates expression once and then assigns the result of this expression to each element in the array
        -- fill method allows you to prefill an array with values other than the default values for the array type
          int[] startValues = new int[10];
            Arrays.fill(startValues, 100);
    - Copying an array (refer to listing CopyDemo)

 * Sorting an array
   ------------------------------
    % sort method is a quick way to sort an array in a sequence
        e.g. int[] lotto = new int[6];
            for (int i = 0; i < 6; i++)
                lotto[i] = (int)(Math.random() * 100) + 1;
                Arrays.sort(lotto);
 * Searching an array
  ----------------------------------

    % binarySearch method is an efficient way to locate an item in an array by its value
    % Method more efficient if sorting through a sequence

 * Comparing arrays
  -----------------------------------
    % if == equal operators are used, array variables are considered to be equal only if points to the same instances
    % Use Arrays.equal method
        e.g. if (Arrays.equal(array1, array2))
                System.out.println("The arrays are equal!");
            - array1and2 are compared element by elements
            - both arrays have to have the same number of elements and all elements have the same value, then equal method will return true
            - if one array has more elements than the other = false
            - if array has more than one dimension, use deepEquals method instead - It compares any two subarrays, element by element, to determine whether 
              they’re identical.

  * Converting arrays to strings
  -----------------------------------
    % toString method of the Arrays class is handy if you want to quickly dump the contents of an array to the console to see what it contains
    % method returns a string that shows the array's elements
    % Works only for 1D arrays
    % To print the contents of a two-dimensional array with the toString method, use a for loop to call the toString method for each subarray 
*
 */
public class Notes {
    
}
