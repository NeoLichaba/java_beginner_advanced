package Chap03_Statics;

/*
 *
 * 
 */
public class CountTestApp {

    public static void main(String[] args) {
        printCount();
        for (int i = 0; i < 10; i++) {
            CountTest c1 = new CountTest(); //instance of CountTest class created within a for loop
            printCount(); //printCount method called and prints ones that have been created thus far
        }
    }

//indicates how many CountTest options have been created thus far; Calls static method to get the count
    private static void printCount() {
        System.out.println("There are now "
                + CountTest.getInstanceCount()
                + " instances of the CountTest class.");
    }
}

class CountTest //CountTest class
{

    private static int instanceCount = 0;      //instanceCount variable stores instanceCount

    public CountTest() //constructor
    {
        instanceCount++;                           //instanceCount increments
    }

    public static int getInstanceCount() //static method returns value of static incstanceCount field
    {
        return instanceCount;
    }
}
