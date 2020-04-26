create table tutorial
(
	id int auto_increment primary key,
	description varchar(128) not null,
	title varchar(32) not null,
	author_id long not null
);

insert into tutorial (title, description, author_id) values ('学习 Java', '该教程可以帮助你学习 Java', 1);
insert into tutorial (title, description, author_id) values ('学习 GraphQL', '很棒的 GraphQL 教程', 2);