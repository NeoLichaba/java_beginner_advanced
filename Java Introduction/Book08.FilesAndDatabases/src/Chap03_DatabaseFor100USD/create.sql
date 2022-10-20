
/**
 * Author:  User
 * Created: 07 Oct 2022
 */

      drop database if exists movies;                                       
create database movies;                                                         
use movies;                                                                     
create table movie (                                                            
 id int not null auto_increment,                                                
                                                                                
                                                                                                          
 title varchar(50),                                                             
 year int,                                                                      
 price decimal(8,2),                                                            
 primary key(id)                                                                
);
insert into movie (title, year, price)                                          
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


