
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
    
  * Querying a Database
    -----------------------------------
    * After one has established a connection to the database, execute select statements 
      to retrieve data. To do so, you have to use several classes and interfaces:
        » Connection: The Connection class has two methods - close method closes the connection, 
          and the createStatement method returns a Statement object, which you then use to execute statements.
        » Statement: The Statement interface contains the methods necessary to send 
        statements to the database for execution and return the results. In particular, 
        you use the executeQuery method to execute a select statement or the 
        executeUpdate method to execute an insert, update, or delete statement.
        » ResultSet: The ResultSet interface represents rows returned from a query. 
        It provides methods you can use to move from row to row and to get the data 
        for a column

    * Refer to Table 4-1 lists the methods of the Connection class and the Statement interface you use to execute qu
    * The first parameter of the createStatement method specifies the type of result 
        set that is created, and can be one of the following:
        ResultSet.TYPE_FORWARD_ONLY
        ResultSet.TYPE_SCROLL_INSENSITIVE
        ResultSet.TYPE_SCROLL_SENSITIVE
    * The second parameter indicates whether the result set is read-only or updatable, and can be one of the following:
        ResultSet.CONCUR_READ_ONLY
        ResultSet.CONCUR_UPDATABLE
    ** Executing a select statement
       --------------------------------- 
        The following snippet executes a select statement and gets the result set:
            Statement s = con.createStatement();
            String select = "Select title, year, price "
             + "from movie order by year";
            ResultSet rows = s.executeQuery(select);
            -- result set stored in rows variable
       
    ** Navigating through the result set
       ------------------------------------------

        - The ResultSet object returned by the executeQuery statement contains all the 
        rows that are retrieved by the select statement.
        - result set maintains a pointer called a cursor to keep track of the current row
        - Use methods in Table 4-2 in order to move cursor through the results set
        **  code that processes each row in a result set:
            while(rows.next())
            {
             // process the current row
             String title = row.getString("title");
                int year = row.getInt("year");
                double price = row.getDouble("price");

            //assuming the columns appear in order:
                String title = row.getString(1);
                int year = row.getInt(2);
                double price = row.getDouble(3);
            }
    ** Getting data from a result set
        Table 4-3 lists the methods of the ResultSet interface you can use to retrieve 
        data from the current row.

* @author User
 */
public class Notes {
    
}
