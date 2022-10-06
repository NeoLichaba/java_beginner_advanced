package Chap02_WorkingWithFileStreams;

import java.io.*;
import java.text.NumberFormat;

/* To read a binary file, work with the following classes:
 * File, FileInputStream,BufferedInputStream and DataInputStream
 *
 * @author Neo
 */
public class P817_ReadBinaryFile {

    
 

    public static void main(String[] args) //→5
    {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        DataInputStream in = getStream("movies.dat");
        boolean eof = false;
        while (!eof) {
            Movie movie = readMovie(in);
            if (movie == null) {
                eof = true;
            } else {
                String msg = Integer.toString(movie.year);
                msg += ": " + movie.title;
                msg += " (" + cf.format(movie.price) + ")";
                System.out.println(msg);
            }
        }
        closeFile(in);
    }

    private static DataInputStream getStream(String name) //→25
    {
        DataInputStream in = null;
        try {
            File file = new File(name);
            in = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream(file)));
        } catch (FileNotFoundException e) {
            System.out.println("The file doesn't exist.");
            System.exit(0);
        }
        return in;
    }

    private static Movie readMovie(DataInputStream in) //→42
    {
        String title = "";
        int year = 0;;
        double price = 0.0;;
        try {
            title = in.readUTF();
            year = in.readInt();
            price = in.readDouble();
        } catch (EOFException e) {
            return null;
        } catch (IOException e) {
            System.out.println("I/O Error");
            System.exit(0);
        }
        return new Movie(title, year, price);
    }

    private static void closeFile(DataInputStream in) //→64
    {
        try {
            in.close();
        } catch (IOException e) {
            System.out.println("I/O Error closing file.");
            System.out.println();
        }
    }

    private static class Movie //→76
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
