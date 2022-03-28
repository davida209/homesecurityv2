

create database homesecurity

use home security

create table user
(
    user_id int primary key
    full_name varchar(255),
    email varchar (255),
    password varchar(255),
    username varchar(255),
    phone varchar(255),
    address varchar(255),
    role varchar(50),

);


create table visitas
(
    visita_number int primary key
    name varchar(255),
    description varchar (255),
    category varchar(255),

);
