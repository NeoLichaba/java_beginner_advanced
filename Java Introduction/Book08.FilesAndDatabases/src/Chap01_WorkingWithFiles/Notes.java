package Chap01_WorkingWithFiles;



/* Two choices for working with files and directories: You can use the original File class or you can use the new Path class, which 
   is part of a new file-processing package called NIO.2. (NIO.2 stands for New I/O version 2.)

 *  Using the File Class (P777)
   -----------------------------
 * File class is your key to processing files and directories
 * File object represents a single file or directory
 * Directory class to represent directories, but then you’d have to know how to use two classes instead of one
 * Path class, which is designed to replace the File class
 
 * Knowing the class constructors and methods (P778)
   -------------------------------------------------

 * Creating a File object (P780)
   ----------------------------------------
   * To create a File object, you call the File constructor, passing a string representing the file name as a parameter
    * example: File f = new File("hits.log");
   *           - file name = hits.log
   * Supply the complete pathname in the parameter if you do not want for it to live in the current directory 
   * If you hard-code pathnames as string literals, the backslash character is the 
     escape character for Java strings. Thus you must code two backslashes to get one 
     backslash in the pathname. You must code the path c:\logs\hits.log like this:
     String path = "c:\\logs\\hits.log"
  
 * Getting information about a file (P781)
   -------------------------------------------
    - To find out whether a File object represents a dile or directory, call its isDirectory and isFile method
    - To get the name of the file represented by a File object:
      - File name - use getName method. Method returns a string that includes the filename, not the complete path
      - Path specified to create File object - toString() method
      - Full path for a file (incl. drive letter and all directories and subdirectories) - getCannonicalPath method
                                                                                         - removes any system-dependent oddities such as relative paths, dots, double dots etc.

 * Getting the contents of a directory (P781)
   ----------------------------------------------
    - A directory is a file that contains a list of other files or directories 
    - Call the isDirectory method in order to determine whether a File object is a directory
        - if the method returns true, the File is a directory
    - You can get an array of all the files contained in a directory by calling the listFiles method
    - File dir = new File(path);
        if (dir.isDirectory())
        {
         File[] files = dir.listFiles();
         for (File f : files)
         System.out.println(f.getName());
        }
    - Lists files, not subdirectories or hidden files
    - File dir = new File(path);
        if (dir.isDirectory())
        {
         File[] files = dir.listFiles();
         for (File f : files)
         {
         if (f.isFile() && !f.isHidden())
         System.out.println(f.getName());
         }
        }
     - Directory listings are especially well suited to recursive programming

     Renaming a file (P782)
   ---------------------------------
`   - Use the renameTo method 
`   - method uses another File object as a parameter that specifies the file you want to rename the current file
    - It returns a boolean value indicates whether the file was renamed successfully 
    - The following statements change the name of a file named hits.log to savedhits.log
    - File f = new File("hits.log");
        if (f.renameTo(new File("savedhits.log")))
         System.out.println("File renamed.");
        else
         System.out.println("File not renamed.");
    }
        - renameFile f = new File("logs\\hits.log");
            if (f.renameTo(new File("savedlogs\\hits.log")))
             System.out.println("File moved.");
            else
             System.out.println("File not moved.")To method can also move a file from one directory to another. This code moves the file hits.log
          from the folder logs to the folder savedlogs:
      
 * @author Neo
 */
public class Notes {
    
}
