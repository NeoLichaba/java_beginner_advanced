package Chap01_WorkingWithFiles;

import java.io.File;

/* Doesn’t create a file on the hard drive
 * Instead it creates an in-memory object 
 * @author Neo
 */
public class P780_CreatingAFile {

    public static void main(String[] args) {
        File f = new File(path);
        if (!f.exists()) {
            System.out.println("The input file does not exist!");
        }
    }
}
