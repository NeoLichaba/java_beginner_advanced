package Chap01_WorkingWithFiles;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;

/* Listing 1.1
 * File Visitor used to walk a file tree
 * Visiting every file in the tree and calling one or more methods defined - called a file visitor 
 * @author Neo
 */
public class P796_FileVisitorDemo {

    public static void main(String[] args) {
        Path start = Paths.get("c:\\Windows\\System32");                        //Creates an instance of the Path class                          
        MyFileVisitor visitor = new MyFileVisitor();                            //Creates an instance of MyFileVisitor class 
        try {
            Files.walkFileTree(start, visitor);                                 //Walks the File tree, starting at the directory indicated by start,
                                                                                //using the MyFileVisitor object
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static class MyFileVisitor extends SimpleFileVisitor<Path>          //Defines MyFilesVisitor class, extends the SimpleFileVisitor class
                                                                                //SimpleFileVisitor is a generic class - specify a type
                                                                                //specify the Path type so that SimpleFileVisitor processes Path objects
    {

        @Override
        public FileVisitResult visitFile(Path file,                             //Overrides the visitFile method - called once for each file that is accessed as the file tree is walked 
                BasicFileAttributes attr) {                         
            System.out.println(file.toString());                                //prints name of the file to the console
            return FileVisitResult.CONTINUE;                                    //Produces the return value of the visitFile method, which is of type 
                                                                                //FileVisitResult
                                                                                //Continue is the most commonly returned value - file-tree walker to continue to process files
        }

        public FileVisitResult visitFileFailed(Path file,                       //Overrides visitFileFailed method - called whenever a file can't be accessed
                                                                                //visitFileFailed method prints an error message
                BasicFileAttributes attr) {
            System.out.println(file.toString() + " COULD NOT ACCESS!");

            return FileVisitResult.CONTINUE;
        }

        public FileVisitResult preVisitDirectoryFailed                          //Overrides the preVisitDirectoryFailed method which is called whenever a directory
                                                                                //visitFileFailed method, preVisitoryDirectoryFailed method prints an error message
                (Path dir, IOException e) {
            System.out.println(dir.toString() + " COULD NOT ACCESS!");
            return FileVisitResult.CONTINUE;
        }
    }
}
