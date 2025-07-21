# Employee Management System

## About the Project

This project is a comprehensive Employee Management System designed to handle employee data and user authentication. It consists of two main modules: an employee management service and a user login service. The system provides RESTful APIs for managing employees and handling user registration and login.

## Capabilities

The Employee Management System offers the following capabilities:

### Employee Management

-   **Add Employee:** Add a new employee to the system.
-   **Get All Employees:** Retrieve a list of all employees.
-   **Delete Employee:** Remove an employee from the system by their ID.
-   **Update Employee:** Modify the details of an existing employee.
-   **Find Employee by ID:** Retrieve an employee's information by their ID.
-   **Find Employee by First Name:** Search for an employee by their first name.

### User Authentication

-   **User Login:** Authenticate users with their credentials.
-   **User Registration:** Register new users to the system.

## Modules

The project is divided into the following modules:

### 1. Employee Management Service (`employee_management_system`)

This module is responsible for all functionalities related to employee data management. It exposes a set of API endpoints for creating, retrieving, updating, and deleting employee records.

### 2. Employee Login Service (`employee_login_sv`)

This module handles user authentication. It provides endpoints for user registration and login, ensuring that only authorized users can access the system.

## Technologies Used

The project is built using the following technologies:

-   **Java 17**
-   **Spring Boot 3.3**
-   **Spring Web**
-   **Spring Data JPA**
-   **Lombok**
-   **MySQL**

## Future Additions

The following are some potential features and enhancements that can be added to the project in the future:

-   **Role-Based Access Control (RBAC):** Implement a role-based access control system to manage user permissions and restrict access to certain functionalities based on user roles (e.g., admin, user).

-   **Department and Role Management:** Add functionality to manage departments and roles within the organization, and assign employees to specific departments and roles.
-   **Search and Filtering:** Enhance the search functionality with advanced filtering options to allow users to search for employees based on various criteria (e.g., department, role, location).
-   **Audit Logging:** Implement audit logging to track all changes made to the system, providing a history of actions performed by users.
