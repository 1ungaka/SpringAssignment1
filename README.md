# CSC313 Assignment 1 Documentation

**Student Name:** Lunga Ngaka
**Course:** BSc Computer Science and Applied Mathematics

---

## 👥 Collaborators

This project was completed with the following collaborators:

* [Sarile Thokozile + 0799093016]
* [Akha Cekiso  + AkhaCekiso ]
* [Qhamani Sobisho + Qhamani36]
* Achuma Dlula + 202250172
* Amkitha Xeke 

(All collaborators were added to the GitHub repository for access and contribution.)

---

## 📌 Project Overview

This assignment focuses on building a Spring Boot application that exposes REST API endpoints.
The project demonstrates backend development concepts such as HTTP communication, CRUD operations, and validation.

---

## ⚙️ Technologies Used

* Java
* Spring Boot
* Maven
* IntelliJ IDEA
* Postman (API testing tool)
* GitHub (version control and collaboration)

---

## 🚀 Part A: Basic Endpoint

### Objective

To create a Spring Boot application with a simple HTTP endpoint.

### Implementation

A REST controller was created to expose a GET endpoint that returns a list of courses.

### Endpoint:

GET /courses

### Output:

Returns a JSON response containing course categories and course names.

### Challenges Faced

* Initial confusion with package structure
* 404 error due to missing endpoint mapping
* Understanding how Spring Boot runs on localhost

---

## 🚀 Part B: CRUD Operations

### Objective

To extend the application by implementing full CRUD functionality.

---

### 1. Create (POST)

Adds a new course to the list.

POST /courses

---

### 2. Read (GET)

Retrieves all courses.

GET /courses

---

### 3. Update (PUT)

Updates an existing course using its ID.

PUT /courses/{id}

---

### 4. Delete (DELETE)

Removes a course using its ID.

DELETE /courses/{id}

---

## ✅ Validation

Validation was implemented using annotations:

* @NotBlank ensures that:

  * Course name is not empty
  * Category is not empty

This prevents invalid data from being added to the system.

---

## 🧪 Testing

The API was tested using Postman:

* GET requests tested in both browser and Postman
* POST, PUT, DELETE tested using Postman
* Errors such as “Method Not Allowed” and connection issues were resolved during testing

---

## ⚠️ Challenges Faced

* Running test classes instead of the main application
* ECONNREFUSED error due to server not running
* GitHub push errors (incorrect repository URL)
* Package naming and file path mismatch
* Validation dependency missing in pom.xml

These issues were resolved through debugging and correcting configurations.

---

## 📂 Version Control (GitHub)

The project was uploaded to GitHub and managed using Git:

* Files were added using `git add .`
* Changes committed using `git commit`
* Project pushed using `git push`

Collaborators were added to allow shared access.

---

## ▶️ How to Run the Project

1. Open project in IntelliJ IDEA
2. Run `Springassignment1Application.java`
3. Ensure server starts on port 8080
4. Access API using:
   http://localhost:8080/courses

---

## 🎯 Conclusion

This project demonstrates how to:

* Build a REST API using Spring Boot
* Implement CRUD operations
* Apply validation
* Test endpoints using Postman
* Use GitHub for version control and collaboration

The assignment provided practical experience in backend development and problem-solving.
