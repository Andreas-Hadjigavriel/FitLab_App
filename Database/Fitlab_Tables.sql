DROP DATABASE IF EXISTS fitlab_application;
CREATE DATABASE IF NOT EXISTS fitlab_application;

USE fitlab_application;

DROP TABLE IF EXISTS customers;
CREATE TABLE customers (
	id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    surname VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    member ENUM('Free','Premium'),
    PRIMARY KEY(id)
);

DROP TABLE IF EXISTS admin;
CREATE TABLE admin(
	id INT NOT NULL AUTO_INCREMENT,
	email VARCHAR(255) NOT NULL,
	password varchar(18) NOT NULL,
	member ENUM('Admin'),
    PRIMARY KEY(id)
);

INSERT INTO customers VALUES
	(null, 'Mixalis', 'Nikolaou', 'mixalis@gmail.com', 'kodikos1', 'Free'),
	(null, 'Andreas','Hadjis','andreas@gamil.com', 'kodikos2', 'Premium');
    
INSERT INTO admin values
	(null, 'george@gmail.com','kodikos3','Admin');