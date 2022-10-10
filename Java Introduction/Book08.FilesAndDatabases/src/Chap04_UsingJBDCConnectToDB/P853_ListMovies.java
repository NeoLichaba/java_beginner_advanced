package Chap04_UsingJBDCConnectToDB;

/* Listing 4.1
 * Program reads data from the movies database and lists it on the console
 * 
 * @author Neo
 */
import java.sql.*;
import java.text.NumberFormat;

public class P853_ListMovies {
    
    
    public static void main(String[] args) 
    {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        ResultSet movies = getMovies();                                         //getMovies method called to get a ResultSet object that contains the movies to be listed
        try {
            while (movies.next()) {                                             //each row read of the result set
                Movie m = getMovie(movies);                                     //getMovie called to create a movie object from data in current row
                String msg = Integer.toString(m.year);
                msg += ": " + m.title;
                msg += " (" + cf.format(m.price) + ")";
                System.out.println(msg);                                        //output string created and sent to console
            }
        } catch (SQLException e) {                                              //next method throws a SQLException - try/catch statement
            System.out.println(e.getMessage());
        }
    }

    private static ResultSet getMovies() //→28                                  //getMovies methods obtains connection to DB
                                                                                //Queries DB to get the movies
    {
        Connection con = getConnection();
        try {
            Statement s = con.createStatement();                                //statement created and executed with select statement
            String select = "Select title, year, price "
                    + "from movie order by year";
            ResultSet rows;
            rows = s.executeQuery(select);                                      //executeQuery executes select statement and returned as a ResultSet object
            return rows;                                                        
        } catch (SQLException e) {
            System.out.println(e.getMessage());                                 //statement created and executed
        }
        return null;
    }

    private static Connection getConnection()                                   //getConnection method created Connection object to DB
    {                                                                           //credentials are hard coded - generally obtain from user
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/Movies";
            String user = "root";
            String pw = "PassWord";
            con = DriverManager.getConnection(url, user, pw);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return con;
    }

    private static Movie getMovie(ResultSet movies)                             //getMovie method extracts title, year and price from current row - creates movie object
    {
        try {
            String title = movies.getString("Title");
            int year = movies.getInt("Year");
            double price = movies.getDouble("Price");
            return new Movie(title, year, price);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static class Movie                                                  //Movie class = inner class
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
