package Chap03_UsingRecursion;

/* Listing 3.1, P527
 * Program demonstrates recursion within an application that has to navigate a directory
 * Uses File class represents a single file or directory
   » The constructor for this class accepts a directory path as a parameter and 
     creates an object that represents the specified directory.
   » You can use the exists method to find out whether the directory specified by 
     the path parameter exists.
   » The listFiles method returns an array of File objects that represent every 
     file and directory in the current File object.
   » The isDirectory method returns a boolean that indicates whether the 
     current File object is a directory. If this method returns false, you can 
     assume that the File object is a file.
  » The getName method returns the name of the file

 * listDirectory() lists all subdirectories in a single directory - 
   1: Prints directory's name
   2: Calls itself to print any subdirectories of that directory
 * Recursion in this program ends when listDirectories method is passed a directory that doesn't have any subdirectories
 * @author Neo
 */
import java.io.File;                                                             //File class
import java.util.Scanner;

public class P527_DirList {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print(
                "Welcome to the Directory Lister");
        do {
            System.out.print("\nEnter a path: ");
            String path = sc.nextLine();                                  
            File dir = new File(path);                                          //path name passed to the File class constructor to create a new File object                                         
            if (!dir.exists() || !dir.isDirectory())                            //exists and isDirectory methods are called to make sure that the path entered by user exists and points
                                                                                //to a directory than a file
            {
                System.out.println(
                        "\nThat directory doesn't exist.");
            } else {
                System.out.println(
                        "\nListing directory tree of:");
                System.out.println(dir.getPath());                              //if good path entered by user, getPath method is called to display the name of the path in File object
                listDirectories(dir, " ");                                      //listDirectories method is called to list all subdirectories in directory specified by user
            }
        } while (askAgain());                                                   //user asked whether they want to list another directory
    }

    private static void listDirectories(                                        //start of listDirectories with params - File object = directory to be listed; String object = spaces used to indent each line of the listing
            File dir, String indent) {                                          //indentation = 2 spaces
        File[] dirs = dir.listFiles();                                          //listFiles method called to get an array of all File objects
        for (File f : dirs)                                                     //enhanced for loop used to process File objects
        {
            if (f.isDirectory())                                                //if statement checks whether file is a directory than a file
            {
                System.out.println(
                        indent + f.getName());                                  //if File = object, indentation string is printed, followed by the name of directory as returned by getName method
                listDirectories(f, indent + " ");                               //listDirectories method is called recursively to list contents of the f directory
                                                                                
            }
        }
    }

    private static boolean askAgain() {
        System.out.print("Another? (Y or N) ");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y")) {
            return true;
        }
        return false;
    }
}
