##Training Center Management System##

This repository contains code for a Training Center Management System implemented in Java using Spring Boot and MySQL as the database.


Project Structure
com.example.demo.TrainingCenter.TrainingCenter
Entity class representing a training center.
Includes fields like center name, center code, address, student capacity, courses offered, contact details, etc.
Utilizes JPA annotations for database mapping.
com.example.demo.TrainingCenter.Address
Embeddable class representing the address of a training center.
Includes detailed address, city, state, and pin code.
com.example.demo.TrainingRepository.TrainingRepository
Spring Data JPA repository for CRUD operations on TrainingCenter entities.
com.example.demo.TrainingController
RESTful controller class exposing endpoints for managing training centers.
Includes methods for creating a new training center, fetching all training centers, and fetching all center codes.

Technologies Used
Java
Spring Boot
MySQL
Spring Data JPA
RESTful API

How to Run
Clone this repository to your local machine.
Set up MySQL database and update application.properties with your database credentials.
Build the project using Maven or your preferred build tool.
Run the application as a Spring Boot application.
Access the API endpoints using a tool like Postman or through a web browser.

API Endpoints
POST /api/training-centers/receive
Create a new training center by providing JSON data in the request body.
GET /api/training-centers
Get a list of all training centers.
GET /api/training-centers/Code
Get a list of all training center codes.

Error Handling
Exception handling is implemented to log and handle runtime exceptions appropriately.
Custom exceptions are thrown with descriptive error messages for better debugging.
Additional Notes
Cross-origin resource sharing (CORS) is enabled for all origins and methods to allow client-side applications to access the API.
Feel free to reach out if you have any questions or need further assistance with running or understanding the project!






