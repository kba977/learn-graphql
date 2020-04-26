create table author
(
	id int auto_increment primary key,
	age int not null,
	name varchar(16) not null
);

insert into author (name, age) values ('bezkoder', 27);
insert into author (name, age) values ('zKoder', 30);