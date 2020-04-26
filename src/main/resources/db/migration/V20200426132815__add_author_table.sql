create table author
(
	id int auto_increment primary key,
	age int not null,
	name varchar(16) not null
);

insert into author (name, age) values ('张三', 25);
insert into author (name, age) values ('李四', 43);