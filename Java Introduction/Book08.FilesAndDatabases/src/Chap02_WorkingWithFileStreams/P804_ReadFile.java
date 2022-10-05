
package Chap02_WorkingWithFileStreams;

/* Stream - a flow of characters to and from a program
 * Java stream I/O 
    - Character streams - read and write text characters that represent strings
    - Binary streams - read and write bytes that represent primitive data types
 * 
 */



import java.io.BufferedReader;                                                  //used to read data one character at a time/line
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;                                                      //reads data from a character sttream originating from a file
import java.io.IOException;
import java.text.NumberFormat;

public class P804_ReadFile {

    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getCurrencyInstance();                   //NumberFormat class formats a value as currency (decimal format)
        BufferedReader in = getReader("movies2.txt");                           //getReader method used to create a BufferedReader object
                                                                                //name of file is passed to this method as a parameter
                                                                                //in a different program, user would use via JFileChooser box
        Movie movie = readMovie(in);                                            //readMovie method used to read each movie from the file
                                                                                //method returns a Movie object or method returns null
        while (movie != null)                                                   //while loop used to process each movie
                                                                                //method returns null
        {
            String msg = Integer.toString(movie.year);
            msg += ": " + movie.title;
            msg += " (" + cf.format(movie.price) + ")";
            System.out.println(msg);
            movie = readMovie(in);
        }
    }                                                                           //program ends w/o closing the file; file closes automatically when the program that opened it ends

    private static BufferedReader getReader(String name)                        //getReader method creates a BufferedReader object for the file name that
                                                                                //passed in the parameter
    {
        BufferedReader in = null;                                               //returns null when the end of the file is reached
        try {
            File file = new File(name);                                         //File object created conneting character stream to a file                              
            in = new BufferedReader(
                    new FileReader(file));                                      //FileReader constructor called to create a FileReader object
                                                                                //Object passed into the BufferedReader constructor to create a BufferedReader object
        } catch (FileNotFoundException e) {
            System.out.println(
                    "The file doesn't exist.");
            System.exit(0);
        }
        return in;
    }

    private static Movie readMovie(BufferedReader in)                           //readMovie method reads a line from the reader passed as a parameter,
                                                                                //parses data in the line, creates a Movie object from the data,
                                                                                //movie object returned
    {
        String title;
        int year;
        double price;
        String line = "";
        String[] data;                                                          //data variable 
        try {
            line = in.readLine();                                               //readLine method reads each line from the file
        } catch (IOException e) {
            System.out.println("I/O Error");
            System.exit(0);
        }
        if (line == null) {
            return null;
        } else {
                                                                                //line read from movies text file to the title in required format
            data = line.split("\t");                                            //String handling feature to split line into individual strings, separated by tabs
            title = data[0];                                                    //title of the movie at index 0
            year = Integer.parseInt(data[1]);                                   //parseInt method to convert year into integer 
            price = Double.parseDouble(data[2]);                                //parseDouble method to convert price into double
            return new Movie(title, year, price);                       
        }
    }

    private static class Movie                                                  //defines Movie objects
    {

        public String title;
        public int year;
        public double price;

        public Movie(String title, int year, double price) {                    //constructor used to initialise the field
            this.title = title;
            this.year = year;
            this.price = price;
        }
    }
}

