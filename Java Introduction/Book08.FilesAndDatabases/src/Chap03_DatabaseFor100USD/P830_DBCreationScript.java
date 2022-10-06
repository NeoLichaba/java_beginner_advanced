package Chap03_DatabaseFor100USD;

/**
 *
 * @author Neo
 */
public class P830_DBCreationScript {
       drop database if exists movies;                                       //drop statment - deletes any exisiting DB with the same name
create database movies;                                                         //new DB created named movies
use movies;                                                                     //use = script statements that follow apply to movie DB
create table movie (                                                            //create table statement creates table names movie with columns; primary key is id column
 id int not null auto_increment,                                                //id columm data type = int; not null = value to exist for every row; 
                                                                                //auto-increment - DB server provides values
                                                                                //Everytime new row added to the table, value for id column incremented                             
 title varchar(50),                                                             //varchar data type for title column
 year int,                                                                      //year's column data type is int
 price decimal(8,2),                                                            //decimal data type for price - converted to double
 primary key(id)                                                                //id column = primary key - unique value
);
insert into movie (title, year, price)                                          //insert - add data to the database
 values ("It's a Wonderful Life", 1946, 14.95);
insert into movie (title, year, price)
 values ("Young Frankenstein", 1974, 16.95);
insert into movie (title, year, price)
 values ("Star Wars", 1977, 17.95);
insert into movie (title, year, price)
 values ("The Princess Bride", 1987, 16.95);
insert into movie (title, year, price)
 values ("Glory", 1989, 14.95);
insert into movie (title, year, price)
 values("The Game",1997,14.95);
insert into movie (title, year, price)
 values("Shakespeare in Love",1998,19.95);
insert into movie (title, year, price)
 values("Zombieland",2009,18.95);
insert into movie (title, year, price)
 values("The King's Speech",2010,17.85);
insert into movie (title, year, price)
 values("Star Trek Into Darkness",2013,19.95);
}
}
