package Chap01_WorkingWithFiles;

import java.io.File;

/* Doesn’t create a file on the hard drive
 * Instead it creates an in-memory object that represents a file or directory that may/may not exisit on the hard drive
 * 
 * @author Neo
 */
public class P780_CreatingAFile {

    public static void main(String[] args) {

        File f = new File(path);                                                //File object created
        if (f.createNewFile()) {                                                //creatNewFile method used to create file; returns a booleran
            System.out.println("File created.");
        } else {
            System.out.println("File could not be created.")
        }
        File f = new File(path);
        if (!f.exists()) {                                                      //exists method used to ascertain if file exists
            System.out.println("The input file does not exist!");
        }

    }
}
