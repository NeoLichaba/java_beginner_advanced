
package Chap02_WorkingWithFileStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/* Program writes lines to a text file
 *
 * @author User
 */
public class P811_WriteFile2 {

    public static void main(String[] args)                                      //getMovie method returns an array of Movie objects                              
    {
        Movie[] movies = getMovies();
        PrintWriter out = openWriter("movies2.txt");                            //PrintWriter object created calling openWriter method - writes data to the file
        for (Movie m : movies) {                                                //enhanced for loop calls writeMovie method for each movies array created
            writeMovie(m, out);                                                 //accepts movie object contains the movie and PrintWriter object to write the movie to
        }
        out.close();                                                            //PrintWriter Closed
    }

    private static Movie[] getMovies()                                          //an array of Movie objects writter to a file
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

    private static PrintWriter openWriter(String name)                          //openWriter method creates a PrintWriter object
                                                                                //file name passed 
    {
        try {
            File file = new File(name);                                         //File object created to connect character stream to output file
            PrintWriter out                                                     //PrintWriter constructor creates a PrintWriter object - write to file (i.e. append data)
                    = new PrintWriter(
                            new BufferedWriter(                                 //Each class adds a capability to class wrapped
                                    new FileWriter(file)), true);               //append mode - any data in file is retained
            return out;
        } catch (IOException e) {
            System.out.println("I/O Error");
            System.exit(0);
        }
        return null;
    }

    private static void writeMovie(Movie m,                                     //writeMovie method accepts Movie object to be written and PrintWriter to where it will be written to
            PrintWriter out) {
        String line = m.title;                                                  //String created
        line += "\t" + Integer.toString(m.year);
        line += "\t" + Double.toString(m.price);
        out.println(line);                                                      //writes string to file
    }

    private static class Movie                                                  //
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
