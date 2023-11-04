create schema books;
use books;

drop table if exists author;
drop table if exists book;

create table author(
	id integer auto_increment,
    first_name varchar(50),
    last_name varchar(50),
    email varchar(256),
    phone varchar(15),
    website varchar(200),
    date_created timestamp,
    date_updated timestamp not null default current_timestamp,
    primary key(id)
);

create table book(
	id integer auto_increment,
    author_id integer,
    title varchar(100),
    sub_title varchar(150),
    description text,
    isbn char(13),
    price decimal(9, 2),
    date_created timestamp,
    date_updated timestamp not null default current_timestamp,
    primary key(id),
    unique key(isbn),
    constraint fk_book_author
		foreign key(author_id) 
        references author(id)
);


alter table author add column middle_name varchar(50);
alter table author drop column middle_name;


alter table author change column middle_name middle_name varchar(50) after first_name;
alter table author modify  middle_name varchar(50) after last_name;
alter table author add column middle_name varchar(50) after first_name;


alter table author add index(last_name);
alter table author drop index last_name;
alter table author add index last_name_idx(last_name);
alter table author drop index last_name_idx;


alter table book drop foreign key fk_book_author;
alter table book add foreign key 
	fk_book_author(author_id) 
    references author(id);


alter table book add column asin char(10) after isbn;
alter table book add column upc decimal(12, 0) after asin;
alter table book add column ean decimal(13, 0) after upc;


alter table book add column upc_barcode char(12) as (lpad(upc, 12, '0'));
select (lpad(12345678, 12, '0'));
alter table book add column ean_barcode char(13) as (lpad(ean, 13, '0'));







































