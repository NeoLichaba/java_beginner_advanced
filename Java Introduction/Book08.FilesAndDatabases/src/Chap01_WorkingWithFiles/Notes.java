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

 * @author Neo
 */
public class Notes {
    
}
