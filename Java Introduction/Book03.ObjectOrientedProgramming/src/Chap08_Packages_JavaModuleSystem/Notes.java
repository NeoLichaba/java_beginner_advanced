
package Chap08_Packages_JavaModuleSystem;

/* Chapter covers:
    * Organizing your classes into neat pacakges - having a structure etc.
    * JAR file - allows you to zip your classes and share with others
    * JavaDocs - add documentation comments to your classes
    * Java Module System - provides improved ways of working with packages

>>Working With Packages
----------------------------------------------------------------
 * Package - a group of classes
 * Allows you to manage a large mass of classes into smaller, manageable collections of classes

> Importing classes and packages
    * import statements - make classes from packages available throughout the file
        * Syntax - import java.util.... - can specify which class
                 - import java.util.* - import all the classes in a package
    * java.lang and default packages don't need to be imported

> Creating your own packages
    1. Pick a name - package names are all lowercase (e.g. can make use of your domain name/email spelt backwards)
    2. Choose a root directory (e.g. c:\javaclasses)
    3. Create subdirectories (e.g. c:\javaclasses\com\lowewriter\util)
    4. Add root directory for your package to the ClassPath environment variable
       - add ; followed by the path to your directory (e.g.;c:\util\classes;c:\javaclasses)
    5. Save files for any classes that belong to the package in the subdirectory (i.e. c:\javaclasses\com\lowewriter\util)
    6. Add a package statement to the beginning of each source file that belongs in a package

>> Putting Your Classes in a JAR (Java Archive) file
------------------------------------------------------------------------
    - Contains more than one file zipped so that JRE can access it quickly
    - Contains a manifest file - contains information about the files in the archive
    - Distribute completed Java applications
    - Run jar comman from command line

>> Archiving a package
-------------------------------------------------------------------------
Steps:
    a. Open command prompt
    b. Use a cd command to navigate to your package root
    c. Use a jar command that specifies the options cf, the name of the jar file, and the path to the class files you want to archive.
      (e.g.jar cf utils.jar com\lowewriter\util\*.class)
    d. Verify that the jar file was created correctly, use the jar command that specifies options tf and name of the jar file
      (e.g. jar tf utils.jar) - lists contents of the jar file so you can see what classes were added

>>


 */
public class Notes {
    
}
