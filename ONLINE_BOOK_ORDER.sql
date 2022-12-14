CREATE DATABASE ONLINE_BOOK_ORDER;

USE ONLINE_BOOK_ORDER;

CREATE TABLE CUSTOMER(
CUSTOMER_ID INT PRIMARY KEY AUTO_INCREMENT,
CUSTOMER_NAME VARCHAR(50) ,
ADDRESS VARCHAR(100),
PHONE_NUMBER VARCHAR(10) ,
EMAIL_ID VARCHAR(30) NOT NULL,
PASSWORD VARCHAR(15) NOT NULL
);


SELECT * FROM CUSTOMER;


CREATE TABLE CITY( 
CITY_ID INT AUTO_INCREMENT PRIMARY KEY,  
CITY_NAME VARCHAR(30)
);


SELECT * FROM CITY;


CREATE TABLE BOOK(
BOOK_ID INT AUTO_INCREMENT PRIMARY KEY,
BOOK_NAME VARCHAR(100) NOT NULL,
AUTHOR_NAME VARCHAR(30),
BOOK_TYPE VARCHAR(30),
BOOK_PRICE INT
);

INSERT INTO BOOK(BOOK_NAME,AUTHOR_NAME,BOOK_TYPE,BOOK_PRICE) VALUES ("Harry Potter and the Chamber of Secrets","J. K. Rowling","Fantasy",599),
("Relativity: The Special and the General Theory","Albert Einstein","Science",399),
("Ghosts of The Silent Hills: Stories based on true hauntings","Anita Krishan ","Horror",499),
("Harry Potter and the Goblet of Fire","J. K. Rowling","Fantasy",600),
("The Canterville Ghost","Oscar Wilde ","Comics",300),
("The Sage's Secret (The Kalki Chronicles)","Abhinav","comics",300),
("WINGS OF FIRE: AUTOBIOGRAPHY OF ABDUL KALAM","A.P.J. Abdul Kalam ","History",400),
("Believe: What Life and Cricket Taught Me","Suresh Raina","Sports",500),
("Harry Potter and the Chamber of Secrets","J. K. Rowling","Fantasy",599);


SELECT * FROM BOOK;


CREATE TABLE CITY_DETAILS(
CITY_ID INT,
FOREIGN KEY(CITY_ID) REFERENCES CITY(CITY_ID),
BOOK_ID INT ,
FOREIGN KEY(BOOK_ID) REFERENCES BOOK(BOOK_ID)
);


SELECT * FROM CITY_DETAILS;


SELECT CITY.CITY_ID , CITY.CITY_NAME , BOOK.BOOK_ID,BOOK.BOOK_NAME FROM CITY JOIN CITY_DETAILS ON CITY.CITY_ID = CITY_DETAILS.CITY_ID JOIN BOOK ON CITY_DETAILS.BOOK_ID = BOOK.BOOK_ID;



CREATE TABLE CART( 
CUSTOMER_ID INT ,
FOREIGN kEY(CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID),
BOOK_ID INT, 
FOREIGN KEY(BOOK_ID) REFERENCES BOOK(BOOK_ID),
BOOK_DATE DATE NOT NULL
);

SELECT * FROM CART;


CREATE TABLE BILL(
BILL_ID INT PRIMARY KEY,
CUSTOMER_ID INT ,
FOREIGN KEY(CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID),
PAYMENT_METHOD VARCHAR(50) NOT NULL,
BILL_DATE TIMESTAMP,
AMOUNT INT
);


SELECT * FROM BILL;



CREATE TABLE ORDER_DETAIL(
ORDER_ID INT auto_increment primary KEY ,
BOOK_ID INT,
FOREIGN KEY(BOOK_ID) REFERENCES BOOK(BOOK_ID),
QUANTITY INT,
BILL_ID INT,
FOREIGN KEY(BILL_ID) REFERENCES BILL(BILL_ID)
);


SELECT * FROM ORDER_DETAIL;