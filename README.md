
# Day5-E-Commerce
    
    This repository contains a Spring Boot application for managing students and courses. It provides RESTful API endpoints for CRUD operations on student and course entities.
    
Project Structure
     
    lk.ac.vau.fas.ict.model: Contains entity classes like Student and Course
    lk.ac.vau.fas.ict.controller: Contains REST controllers for handling HTTP requests
    
Main Components
    
    Models
    
    1. Student: Represents a student with properties like registration number, name, age, course, and GPA
    2. Course: Represents a course with properties like code, name, and credits
    
    Controllers
    
    1. AppController: Manages student-related operations 
        Provides endpoints for retrieving, adding, updating, and deleting student records
        Uses a HashMap for efficient student lookup by registration number 
    2. ClassController: Manages course-related operations 
        Extends the generic CRUDController for basic CRUD operations
        Pre-populated with sample course data   
    3. CRUDController: A generic controller providing basic CRUD operations
        Implemented as a generic class that can work with different entity types
        Provides methods for retrieving, adding, updating, and deleting records  

Getting Started
    
    Prerequisites
        Java Development Kit (JDK) 8 or later
        Maven or Gradle
        Spring Boot
    
    Running the Application
        Clone the repository
        Navigate to the project directory
        Run mvn spring-boot:run or ./gradlew bootRun depending on your build tool
        Access the API at http://localhost:8080

API Endpoints
   
    Student Endpoints
    1. GET /app/msg: Returns a message
    2. GET /app/student1: Returns a the details of student1  
    3. GET /app/students: Returns all the students
    4. GET /app/students/{regNo}: Returns a specific student by registration number
    5. GET /app/age/{age}: Returns the age
    6. POST /app/add: Adds a new student
    7. DELETE /app/students/{id}: Deletes a student by registration number
    8. PUT /app/students/{id}: Updates a student by registration number

    Course Endpoints
    1. GET /course/: Returns all courses
    2. POST /course/add/{id}: Adds a new course
    3. DELETE /course/delete/{id}: Deletes a course by code
    4. PUT /course/update/{id}: Updates a course by code


