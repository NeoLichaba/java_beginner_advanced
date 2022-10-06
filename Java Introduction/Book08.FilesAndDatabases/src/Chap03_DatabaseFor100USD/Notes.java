
package Chap03_DatabaseFor100USD;

/* SQL - Structured Query Language - language used for creating and accessing relational databases
 * JDBC - Java DB Connectivity lets you formulate SQL statements, send to DB and process the results
 * Relational Database - DB in which data is stored in tables or accessed via SQL
 * Before you can store data in a relational database, you must create the database
 * By writing a script file that contains the Create statements necessary to create the table and 
   then running the script through the database server’s administration program
 * Semicolon isn’t required when you use SQL statements in a Java program
 * ; Required only when you use SQL statements in a script or interactively from the 
    MySQL Command Line Client program

    Querying a DB
    -----------------------------
  - A query is an operation performed against one or more SQL tables; it extracts 
    data from the tables and creates a result set
  - SELECT statement - 
    e.g select title, year - columns you want to include in the query result
        from movie - table from which you want to retrive the rows
        order by year; - sorted by year column
    
    Narrowing the query
    -----------------------------
  - To select certain rows from a table, use the where clause

    Excluding rows
    -----------------------------
  - retrieve rows except those that match a certain criteria 
    e.g select title, year from movie
           ->where year < 1970 or year > 1979
            -> order by year;
 
    Using singleton selects
    ------------------------------------
  -  When you want to retrieve information for a specific row, mention the primary 
  -  key column in the where clause, like this:
  -  mysql> select title, year from movie where id = 7
  -  where clause selects the row whose id column equals 7
  -  select statement is called a singleton select because it retrieves only one row.
  -  allow users to access or update a specific database row

    Finding what something sounds like
    -----------------------------------------------
  - Suppose that you want to retrieve information about a movie and can’t quite 
    remember the name, but you know that it includes the word princess. One of the 
    most interesting variations of the where clause throws in the word like, which 
    lets you search rows using wildcards
    e.g. mysql> select title, year from movie
         -> where title like "%princess%"

    Using column functions
    -------------------------------------------------
  - if you want a count of the total number of movies in the movie table or a 
    count of the number of movies
  - use column function (refer to table 3.2, p836)

    Selecting data from more than one table
    -------------------------------------------------- 
  - select statements retrieve data from two or more tables

    Eliminating Duplicates
    ---------------------------------------------------
  - You can eliminate duplicate rows by adding the distinct keyword in the select statement

    Updating and Deleting Rows
    --------------------------------
    
    Using the delete statement
    The basic syntax of the delete statement is:
    delete from table-name where condition;

    Using the update statement
    ----------------------------------
   - update statement selects one or more rows in a table and then modifies the 
   - value of one or more columns in the selected rows. Its syntax is this:
        update table-name
            set expressions...                  - set = updates as in java
            where condition;
        e.g. update movie set price = 18.95 where id = 8;
    
   - update more than one column, use commas to separate the expressions
   - update statement you should know about is that the set expressions can include calculations
     e.g update movie set price = price * 1.1;

 * @author User
 */
public class Notes {
    
}
