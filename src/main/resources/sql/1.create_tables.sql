create schema product_service_local;

create table products(
id bigint not null auto_increment,
`name` varchar(20) not null,
uuid  varchar(120) not null,
`description` varchar(200),
price double(10,2) not null,
primary key (id));