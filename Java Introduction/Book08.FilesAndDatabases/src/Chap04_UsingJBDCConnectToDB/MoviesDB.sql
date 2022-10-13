create database movies;                                                         
use movies;                                                                     
create table movie (                                                            
id int not null,
title varchar(50),
year int,                                                                      
price decimal(8,2),                                                            
primary key(id)                                                                
);

insert into movie (id, title, year, price)                   --The insert statements add data to the database. You first list colums names
 values ('00', 'Its a Wonderful Life', '1946', '14.95'),   --Then the data you want to insert into the columns
 ('01','Young Frankenstein', '1974', '16.95'),
 ('02','Star Wars', '1977', '17.95'),
 ('03','The Princess Bride', '1987', '16.95'),
 ('04','Glory', '1989', '14.95'),
 ('05','The Game','1997','14.95'),
 ('06','Shakespeare in Love','1998','19.95'),
 ('07','Zombieland','2009','18.95'),
 ('08','The Kings Speech','2010','17.85'),
 ('09','Star Trek Into Darkness','2013','19.95');

select * from movie;



