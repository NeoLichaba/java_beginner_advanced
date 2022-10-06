package Chap02_WorkingWithFileStreams;

import java.io.*;
import java.text.NumberFormat;

/* To read a binary file, work with the following classes:
 * File - File itself
 * FileInputStream - connects input stream to the file
 * BufferedInputStream - creates a buffer 
 * DataInputStream - reads data from the stream (primitive and strings)
 * Program demonstrates reading and writing data in a binary file which has info about movies
 * All read method throw eof exception 
 * @author Neo
 */
public class P817_ReadBinaryFile {

    
 

    public static void main(String[] args)                                      //→5
    {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        DataInputStream in = getStream("movies.dat");                           //getStream method gets data input object to read the file                             
        boolean eof = false;                                                    //eof is initialised at false
        while (!eof) {                                                          //while loop loops through all read methods
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

    private static DataInputStream getStream(String name)                       //DataInputStream connected to file to read data from a binary file
                                                                                //getStream method gets data input object to read the file
    {           
        DataInputStream in = null;
        try {
            File file = new File(name);                                         //File object instantiated with file name
            in = new DataInputStream(                                           //provides methods that read the data types
                    new BufferedInputStream(                                    //buffering added    
                            new FileInputStream(file)));                        //represents file
        } catch (FileNotFoundException e) {                                     //FileNotFoundException thrown
            System.out.println("The file doesn't exist.");
            System.exit(0);                                                     //exists program if file not found
        }
        return in;                                                              //
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
