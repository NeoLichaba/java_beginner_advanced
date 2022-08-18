/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReadFile;

/*
 *
 * 
 */



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;

public class ReadFile {

    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        BufferedReader in = getReader("movies2.txt"); //→8
        Movie movie = readMovie(in); //→9
        while (movie != null) //→10
        {
            String msg = Integer.toString(movie.year);
            msg += ": " + movie.title;
            msg += " (" + cf.format(movie.price) + ")";
            System.out.println(msg);
            movie = readMovie(in);
        }
    } //→18

    private static BufferedReader getReader(String name) //→19
    {
        BufferedReader in = null;
        try {
            File file = new File(name);
            in = new BufferedReader(
                    new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println(
                    "The file doesn't exist.");
            System.exit(0);
        }
        return in;
    }

    private static Movie readMovie(BufferedReader in) //→36
    {
        String title;
        int year;
        double price;
        String line = "";
        String[] data;
        try {
            line = in.readLine();
        } catch (IOException e) {
            System.out.println("I/O Error");
            System.exit(0);
        }
        if (line == null) {
            return null;
        } else {
            data = line.split("\t");
            title = data[0];
            year = Integer.parseInt(data[1]);
            price = Double.parseDouble(data[2]);
            return new Movie(title, year, price);
        }
    }

    private static class Movie //→63
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

