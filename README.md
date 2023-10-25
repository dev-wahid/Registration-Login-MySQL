# Registration-Login-MySQL

**Create database and insert sample data**

•  CREATE DATABASE users;
•  USE users;
•  CREATE TABLE tbl_users
(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);
•  INSERT INTO tbl_users(email, password) VALUES ("something@example.com", "01234");
•  INSERT INTO tbl_users(email, password) VALUES ("anything@example.com", "56789");

**Tools and Technologies Used**

Spring Boot 3+ , JDK 17 or later, MySQL, IDE - STS.

• 1)  **Create Spring Boot Project and Configure Dependencies**

Spring Web, Spring Data JPA, MySQL Driver, Spring Security, Spring Boot DevTools and Lombok(if needed).

Configure the datasource:
Open application.properties file and add the contents

Create entity class
Create User.java class in entity package and add the content

Create Repository class
Create UserRepository.java class in repository package and add the content

Create Configuration classes
Create AppSecurityConfig.java class inside config package and add the content

Create custom user details class
Create CustomUserDetailsService.java class inside security package and add the  content

Create Controllers
Create HomeController.java class inside controller package and add the  content

Create AuthController.java class inside controller package and add the content

Run the app

Open the Postman and enter the following URL –

POST: localhost:8080/login

click 'Body' and select 'raw' and select 'JSON' and enter the JSON Object

{
    "email": "something@example.com",
    "password": "01234"
}

GET:  localhost:8080/dashboard

select Authorization : give Username and Password (from the database)
