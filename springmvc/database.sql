#MYSQL

create database ravens;
use ravens;

create table alien(
aid int,
aname varchar(20)
);

insert into alien values
(101,"prashant"),
(110,"cosmic");

select * from alien;
delete from alien where aname is null;
select * from alien where aname is null;

commit;
