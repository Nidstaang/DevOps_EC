
CREATE DATABASE banking;
USE banking;

create table customers (
	id INT AUTO_INCREMENT,
	first_name VARCHAR(100),
	last_name VARCHAR(100),
	holding INT,
  PRIMARY KEY (id)
);
 
