
package Chap01_WorkingWithFiles;

import java.io.File;
import java.io.IOException;

/*Doesn’t create a file on the hard drive
 *Instead it creates an in-memory object that represents a file or directory that may/may not exisit on the hard drive
 * 
 *
 * @author Neo
 */
public class P780_CreatingAFile {
   
  public static void main(String[] args) {
    try {
      File myObj = new File("C:\\Users\\User\\OneDrive\\Desktop\\Code College_2022\\6.Java\\Java Projects\\Java Introduction\\Book08.FilesAndDatabases\\music.txt");
      if (myObj.createNewFile()) {                                              //createNewFile method used to create file; returns a boolean
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");                             //msg returned if file already exists
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}

