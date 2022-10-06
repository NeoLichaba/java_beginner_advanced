package Chap02_WorkingWithFileStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Neo
 */
public class P811_WriteFile {

    public static void main(String[] args)                                      
    {
        Movie[] movies = getMovies();                                           //getMovies method called, returns an array of Movie objects written to the file
        PrintWriter out = openWriter("movies2.txt");                            //openWriter called which creates a PrintWriter object - data written to file
        for (Movie m : movies) {                                                //enhanced for loop used to call writeMovie method for each movie in the array 
            writeMovie(m, out);                                                 //writeMovie accepts a movie object (movie to be written) 
                                                                                //and PrintWriter object to write movie to
        }
        out.close();                                                            //PrintWriter closed
    }

    private static Movie[] getMovies()                                          //getMovies method returns an array of Movie objects
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

    private static PrintWriter openWriter(String name)                          //openWriter method creates a PrintWriter object for the filename
                                                                                //passed as a parameter. PrintWriter = buffer
    {
        try {
            File file = new File(name);
            PrintWriter out
                    = new PrintWriter(
                            new BufferedWriter(
                                    new FileWriter(file)), true);
            return out;
        } catch (IOException e) {
            System.out.println("I/O Error");
            System.exit(0);
        }
        return null;
    }

    private static void writeMovie(Movie m,                                     //writeMovie method accepts Movie object to be written
            PrintWriter out) {                                                  //PrintWriter to which the movie should be written    
        String line = m.title;                                                  //String created
        line += "\t" + Integer.toString(m.year);                                //toString method -  
        line += "\t" + Double.toString(m.price);
        out.println(line);
    }

    private static class Movie                                                  //movie object defined
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
