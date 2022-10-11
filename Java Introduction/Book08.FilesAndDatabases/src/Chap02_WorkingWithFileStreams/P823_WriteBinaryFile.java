package Chap02_WorkingWithFileStreams;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* Program writes movies.dat file from an array of Movie objects whose values are hard-coded into the program
 * To write to a binary file, use the following classes:
    FileOutputStream - connects to a file object and creates an output stream that can write to the file
    BufferedOutputStream -connects to FileOutputStream and adds output buffering
    DataOutputStream - gives ability to write primitive data types and strings to a stream
    streams - i/o streams 

 * @author Neo
 */
public class P823_WriteBinaryFile {

    public static void main(String[] args)                                      
    {
        Movie[] movies = getMovies();                                           //getMovies method called to get an array of Movie objects
        DataOutputStream out = openOutputStream("movies2.dat");                 //openOutputStream to get an output stream to write data to the file
        for (Movie m : movies) {                                                //enhanced for loop calls writeMovie to write movies to the file
            writeMovie(m, out);                                                 
        }
        closeFile(out);                                                         //closeFile closes file
    }

    private static Movie[] getMovies()                                          //getMovies method creates an array of movies to be written to the file
    {
        Movie[] movies = new Movie[10];
        movies[0] = new Movie("It's a Wonderful Life",
                1946, 14.95);
        movies[1] = new Movie("Young Frankenstein",
                1974, 16.95);
        movies[2] = new Movie("Star Wars",
                1977, 17.95);
        movies[3] = new Movie("The Princess Bride",
                1987, 16.95);
        movies[4] = new Movie("Glory",
                1989, 14.95);
        movies[5] = new Movie("The Game",
                1997, 14.95);
        movies[6] = new Movie("Shakespeare in Love",
                1998, 19.95);
        movies[7] = new Movie("Zombieland",
                1997, 18.95);
        movies[8] = new Movie("The King's Speech",
                1997, 19.95);
        movies[9] = new Movie("Star Trek Into Darkness",
                1997, 19.95);
        return movies;
    }

    private static DataOutputStream
            openOutputStream(String name)                                       //openOutputStream  method creates a DataOutputStream object so that 
                                                                                //the program can write data to the file
    {
        DataOutputStream out = null;
        try {
            File file = new File(name);                                         //File object created connecting character stream to a file
            out = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(file)));
            return out;
        } catch (IOException e) {
            System.out.println(
                    "I/O Exception opening file.");
            System.exit(0);
        }
        return out;
    }

    private static void writeMovie(Movie m,                                     //movie to be written and output stream to write the data to
            DataOutputStream out) {
        try {
            out.writeUTF(m.title);                                              //writes string stored in UTF format to output stream
            out.writeInt(m.year);                                               //writes int value to output stream
            out.writeDouble(m.price);                                           //writes double value to output stream
        } catch (IOException e) {                                               //write methods throw exception thus enclose in try/catch statement
            System.out.println(
                    "I/O Exception writing data."); 
            System.exit(0);                                                     //status code = successful completion
        }
    }

    private static void closeFile(DataOutputStream out)                         //closeFile method closes the file
    {
        try {
            out.close();                                                        //close method of File method
        } catch (IOException e) {
            System.out.println("I/O Exception closing file.");
            System.exit(0);                                                     //status code = successful
        }
    }

    private static class Movie                                                  //private inner classS
    {

        public String title;
        public int year;
        public double price;

        public Movie(String title, int year, double price) {
            this.title = title;
            this.year = year;
            this.price = price;
        }
    }

}
