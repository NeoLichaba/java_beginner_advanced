package Chap03_UsingRecursion;

/* Listing 3.2, P535
 * Program demonstrates QuickSortApp in it's entirety

 * @author Neo
 */
public class P535_QuickSortApp {

    public static void main(String[] args) {
        int LEN = 100;              
        int[] unsorted = new int[LEN];
        for (int i = 0; i < LEN; i++)                                            //for loop assigns 100 unsorted values t
        {
            unsorted[i]
                    = (int) (Math.random() * 100) + 1;
        }
        System.out.println("Unsorted array:");
        printArray(unsorted);                                                   //unsorted array printed using printArray method
        int[] sorted = sort(unsorted);                                          //sort method called to sort the array
        System.out.println("\n\nSorted array:");
        printArray(sorted);                                                     //printArray called to sort sorted array
    }

    private static void printArray(int[] array)                                 
    {
        System.out.println();
        for (int i = 0; i < array.length; i++) {                                //printArray method used in for loop to print array elements
            if (array[i] < 10) {                                                 
                System.out.print(" ");
            }
            System.out.print(array[i] + " ");
            if ((i + 1) % 20 == 0) {                                            //remainder operator is used to call the println method every 20 elements
                System.out.println();                                           //5 lines with 20 values printed on each line
            }
        }
    }
    private static int[] a;                                                     //a used to store array whilst being sorted

    public static int[] sort(int[] array)                                       //sort method has 2 versions. int accepted 
    {                                                                           
        a = array;                                                              //a variable set to the array passed via parameters
        sort(0, a.length - 1);                                                  //second array is called to sort
        return a;                                                               //int value returned - sorted array
    }

    public static void sort(int low, int high)                                  //second sort method; sorts partition according to parameters
    {
        if (low >= high) {
            return;
        }
        int p = partition(low, high);           
        sort(low, p);
        sort(p + 1, high);
    }

    public static int partition(int low, int high)                              //low and high ends of the partition to be
                                                                                //partitioned are passed in as parameters
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
            
    public static void swap(int i, int j)                                       //swap method exchanges the 2 indicated values
    {
        int temp = a[i];                                                        //i element moved into a temp variable
        a[i] = a[j];                                                            //j element moved to i element
        a[j] = temp;                                                            //j elememt moved to temp element
    }
}
