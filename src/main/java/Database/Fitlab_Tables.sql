DROP DATABASE IF EXISTS fitlab_application;
CREATE DATABASE IF NOT EXISTS fitlab_application;

USE fitlab_application;

DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS administrator;
DROP TABLE IF EXISTS perimumCustomer;
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS offers;
DROP TABLE IF EXISTS ordersHistoryList;

CREATE TABLE customers(
	customerId int(5) NOT NULL PRIMARY KEY auto_increment,
	email varchar(255) NOT NULL,
    username varchar(18) NOT NULL ,
	password varchar(18) NOT NULL,
	sex ENUM('male','female'),
	Member ENUM('Free','Premium')
);

CREATE TABLE perimumCustomer(
	points INT
);

CREATE TABLE administrator(
	username varchar(18) NOT NULL,
	password varchar(18) NOT NULL,
	email varchar(255) NOT NULL PRIMARY KEY,
	member ENUM('Admin')
);

CREATE TABLE orders(
	customerEmail varchar(50) NOT NULL PRIMARY KEY,
    customerName varchar(20) NOT NULL, 
	itemListName varchar(100) NOT NULL,
    quantityPerItem int,
    orderDate date, 
	cost double 
);

CREATE TABLE products(
	productId int PRIMARY KEY, 
	productName varchar(255) NOT NULL,
	price double,
	quantity int
);

CREATE TABLE offers(
	offerProductId int PRIMARY KEY,
	itemListName varchar(50) NOT NULL,
	discount double
);

CREATE TABLE ordersHistoryList(
	customerEmail varchar(100) NOT NULL,
    buyListDate date,
    orderId int PRIMARY KEY
);

CREATE TABLE favouriteProducts(
	fCustomerId int(5) NOT NULL PRIMARY KEY,
    fProductName VARCHAR(100) NOT NULL,
    fProducrId INT(5) NOT NULL
);
	



