create table tutorial
(
	id int auto_increment primary key,
	description varchar(128) not null,
	title varchar(32) not null,
	author_id long not null
);

insert into tutorial (title, description, author_id) values ('Tutorial #1', 'updated Desc Tut#1', 1);
insert into tutorial (title, description, author_id) values ('Tutorial #2', 'Description for Tut#2', 2);