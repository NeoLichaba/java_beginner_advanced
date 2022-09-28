
package Chap03_UsingRecursion;

/* Recursion - method calls itself to solve a problem
 * Method using this technique is called recursive

 - Calculating the Classic Factorial Example (refer to Recursive and Non Recursive solution)
    $ factorial - product of all integers from 1 to n (i.e. factorial of 5 = 120 (5 x 4 x 3 x 2 x 1)

 - Displaying Directories (refer to DirList example)
    $ Navigate directory structure
    $ DirList demonstrates recursion
 
 - Writing Your Own Sorting Routine
    $ Quicksort - alternative to recursion
    $ How QuickSort Works
        1. Pick an arbitrary value that lies within the range of values in the array.
                This value is the pivot point. The most common way to choose the pivot point 
                is to simply pick the first value in the array
        2. Rearrange the values in the array so that all the values that are less than 
           the pivot point are on the left side of the array and all the values that are 
           greater than or equal to the pivot point are on the right side of the array.
                The pivot value indicates the boundary between the left side and the right side 
                of the array. It probably won’t be dead center, but that doesn’t matter. This step 
                is called partitioning, and the left and right sides of the arrays are partitions.
        3. Now treat each of the two sections of the array as a separate array, and 
           start over with Step 1 for that section.
                That’s the recursive part of the algorithm
    $ Using the sort method
       public static void sort(int low, int high)                               //method sorts portion of array by high and low index values passed to it
            {
             if (low >= high)                                                   //low val vs. high val compared
             return;                                                            //sort method returns without sorting itself
             int p = partition(low, high);
             sort (low, p);                                                     //sort method calls partition method
                                                                                //partition method rearranges array into 2 portions
                                                                                //
             sort (p+1, high);                                                  //to get sort method started, call it with 0 as the low value
                                                                                //array length + 1 as the high value
            }               
        

    $ Using the partition method
       -Partition method accepts 2 parameters - low and high indexes that mark the portion of array to be sorted
       - 
 * @author Neo
 */
public class Notes {
    
}
