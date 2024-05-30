# Student Management Project

## Overview

This project is a Spring Boot application designed to manage student records. It provides RESTful APIs for CRUD (Create, Read, Update, Delete) operations on student data. The application uses Spring Data JPA for database interactions.

## Features

- **Create**: Add a new student record.
- **Read**: Retrieve all student records or a specific student record by ID.
- **Update**: Update an existing student record by ID.
- **Delete**: Delete a student record by ID or delete all student records.

Methods:
- createNewRecord: Saves a new student record.
- getAllRecord: Retrieves all student records.
- getRecordById: Retrieves a student record by ID.
- updateRecord: Updates an existing student record.
- deleteRecordById: Deletes a student record by ID.
- deleteAllRecord: Deletes all student records.

Endpoints:
- POST:  http://localhost:8080/api/create: Creates a new student record.
- GET: http://localhost:8080/api/get: Retrieves all student records.
- GET: http://localhost:8080/api/get/{id}: Retrieves a student record by ID.
- PUT: http://localhost:8080/api/update/{id}: Updates a student record by ID.
- DELETE: http://localhost:8080/api/delete/{id}: Deletes a student record by ID.
- DELETE: http://localhost:8080/api/delete: Deletes all student records.
