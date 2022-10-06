
package Chap03_UsingRecursion;

/* Recursion - method calls itself to solve a problem
 * Method using this technique is called recursive

 - Calculating the Classic Factorial Example (refer to Recursive and Non Recursive solution)
    $ factorial - product of all integers from 1 to n (i.e. factorial of 5 = 120 (5 x 4 x 3 x 2 x 1)

 - Displaying Directories (refer to DirList example)
    $ Navigate directory structure
    $ DirList demonstrates recursion
 
 - Writing Your Own Sorting Routine
    $ Quicksort - alternative to recursion (refer to QuickSortApp example)
    $ How QuickSort Works
        1. Pick an arbitrary value that lies within the range of values in the array.
                This value is the pivot point. The most common way to choose the pivot point 
                is to simply pick the first value in the array
        2. Rearrange the values in the array so that all the values that are less than 
           the pivot point are on the left side of the array and all the values that are 
           greater than or equal to the pivot point are on the right side of the array.
                The pivot value indicates the boundary between the left side and the right side 
                of the array.  This step is called partitioning, and the left and right sides of the arrays are partitions.
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
       - Basic outline of partition method:
         1. Pick a pivot point.
         2. Move all elements that are less than the pivot point to the left side of 
            the partition.
         3. Move all elements that are greater than the pivot point to the right side 
            of the partition.
        4. Return the index of the pivot point
       
       - Common technique for partitioning the array is to maintain 2 index variables - i&j
       - i starts at the beginning - moves towards pivot point
       - j starts at the opposite end - moves backwards until it finds a value less than the pivot point
       - Swaps them as indexes are higher>pivot point on RHS and less than<pivot point on LHS
       - i increments until finds another value>than pivot point
       - j decrements until it finds another value less than the pivot value - elements are swapped
       - Once j<i - partitioning stops 

        public static int partition(int low, int high)                          //low and high ends of the partition to be
                                                                                partitioned are passed in as parameters
        {
            int pivot = a[low];                                                 //pivot point value chosen
            int i = low - 1;                                                    //i & j initialised
                                                                                //step back taken (-/+)
            int j = high + 1;                       
            while (i < j)                                                       //while loop indicates when partitioning is finished (j)
            {
                for (i++; a[i] < pivot; i++);                                   //increments i until value > pivot point
                for (j--; a[j] > pivot; j--);                                   //decrements j until value < pivot point
                if (i < j)                                                      //checks if values have crossed
                swap(i, j);                                                     //if they haven't, swap method called and values swapped
         }
            return j;
        }

 * @author Neo
 */
public class Notes {
    
}
