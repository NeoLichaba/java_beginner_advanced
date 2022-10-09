
package Chap04_UsingJBDCConnectToDB;

/* JDBC - Java Database Connectivity - allows you to connect to any relational database system
 * 
 * Connecting to a Database
   -----------------------------
   * First need to establish a connection to the database
     * Register driver class so the class is available
       * Use forName method of Class class, specify the package and class name of the driver\
       * Register MySQL connector: Class.forName("com.mysql.jdbc.Driver");
       * forName method throws a ClassNotFoundException
       * Call static getConnection method of DriverManager to open the connection
         * Takes 3 String paramteres - database URL, the usernane and password:
            String url = "jdbc:mysql://localhost/Movies"; syntax: jdbc:subprotocol:subname; (subprotocol = mysql for MySQL database, odbc = ODBC driver, subname = DB name)
            String user = "root";
            String pw = "pw";
            con = DriverManager.getConnection(url, user, pw);
       * For ODBC, you use the name you used when you created the data source. For 
         example:
         String url = "jdbc:odbc:Movies";
       * getConnection method throws SQLException

       * 
 * @author User
 */
public class Notes {
    
}
