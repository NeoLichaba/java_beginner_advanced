
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

> Putting Your Classes in a JAR (Java Archive) file

    - Contains more than one file zipped so that JRE can access it quickly
    - Contains a manifest file - contains information about the files in the archive
    - Distribute completed Java applications
    - Run jar comman from command line

>> Archiving a package

Steps:
    a. Open command prompt
    b. Use a cd command to navigate to your package root
    c. Use a jar command that specifies the options cf, the name of the jar file, and the path to the class files you want to archive.
      (e.g.jar cf utils.jar com\lowewriter\util\*.class)
    d. Verify that the jar file was created correctly, use the jar command that specifies options tf and name of the jar file
      (e.g. jar tf utils.jar) - lists contents of the jar file so you can see what classes were added

>> Adding a jar to your Classpath
    - Add jar file to your ClassPath environment variable
    - Add complete path to the archive, separating it from any other path with 
      (e.g. .;c:\javaclasses\utils.jar;c:\javaclasses)
    - To add multiple jar files from a particular directory to ClassPath (e.g. .;c:\javaclasses/*)
    - The first path is always . - allows Java to find classes in the current directory

>> Running a program directly from an archive

    $ Create a manifest file before you create the archive in order for the Java program to be run directly from it
    $ Manifest file is a txt file that contains information about the files in the archive
    $ .mf - extension 
    $ Main-Class : ClassName (to make executable jar file)
      - Main-Class: com.lowewriter.game.GuessingGame -
                    - com.lowewriter = package
                    - game(.mf) = manifest file
                    - GuessingGame = ClassName
    $ To run the jar command - jar cfm game.jar com\lowewriter\game\game.mf com\lowewriter\game\*.class
      Use options cfm, the name of the archive to create, the name of the manifest file, and the path for the class files\
    $ Run the application directly from a command prompt by using the java command with the -jar switch and the name of the archive file.
      java -jar game.jar - comman starts JRE and executes the main method 

Using JavaDoc to Document Your Classes
-----------------------------------------------------------
    & JavaDoc automatically creates a HTML based doc based on comments in your files
    & Add a comment to each public class, file and method
    & Run the source files through the Javadoc command

> Adding JavaDoc comments
    JavaDoc comments can be placed in any of these locations:

        & Immediately before the declaration of a public class
        & Immediately before the declaration of a public field
        & Immediately before the declaration of a public method or constructor
    & Multiline comments 
    & Can include HTML markup but avoid usung heading tags as the JavaDocs creates those
    & Can use doc tags that provide speific info used by JavaDoc

> Using the javadoc command
    & javadoc com\lowewriter\payroll\*.java - path used to create documentation for
        - javadoc creates doc pages in current directory

> Viewing JavaDoc pages
    & Access documentation pages by starting with index.html page - type index.html at the command prompt
    & To look at the documentation for a class, click on the class name's link

Using the Java Module System
----------------------------------------------------------------
    Downfall of packages:
    & Developers often have problems managing packages for large applications that use a number of packages,
      especially if packages require different versions of Java
    & Don't provide an easy way to create lightweight packages - limits Java's ability to run on devices with limited resources
      - such as controllers or smartphones
    & These pitfalls are addressed by JVS aka Project Jigsaw
    & Module - groups classes and explicitly lists which other modules the module depends on and specific public types
             - Must list its dependencies
             - Must list visibility packages contained within the module
             - Stored in JAR file = modular JAR file. Modular JAR file contains a class called a module-info.class that identifies
               the module's dependencies and packages visible to other modules (by source file module-info.java)

    & module-info.java file
      - Defines a module
      - module com.lowewriter.payroll {} - creates a module but does not define any dependencies or exported packages
      - Named like packages (i.e. reverse domain notation)
      - To specify module is dependent on another module, add a "requires" statement that specifies the name of the module
        e.g. module com.lowewriter.payroll {
                requires java.SQL;
                requires com.lowewriter.util;
                exports com.lowewriter.payrolldb; - export statements to export packages contained in a module
            }

--  Setting up folders for a module
    &  module-info.java file must be in the root folder for the module
    &  e.g. com.lowewriter.payroll
                module-info.java
                    com
                        lowewriter
                            payroll
                                Address.java
                                    Employee.java

-- Compiling a module

    & Use javac command and specify name of the all source files you want to compile
    & Navigate to the root folder for the module
        e.g. javac module-info.java com\lowewriter\payroll\*.java - command will create a module-info.class file in the module's root folder

-- Creating a modular JAR file

    & jar cf com.lowewriter.payroll.jar *.class com\lowewriter\payroll\*.class
        cf = create a jar file
        followed by the class files to include
    & You can verify that the Jar file contains the correct contents by running the jar file command with tf followed by name of the jar file
        C:\Java9\com.lowewriter.payroll>jar tf com.lowewriter.payroll.jar


 */
public class Notes {
    
}
