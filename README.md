# Hospital Management System | Spring Boot REST API

A secure backend-based Hospital Management System built using Spring Boot, Spring Data JPA, Hibernate, Spring Security, REST APIs, and Oracle Database. This project manages core hospital operations such as patients, doctors, appointments, treatments, and billing through secured RESTful web services.

## Features

- Patient management APIs
- Doctor management APIs
- Appointment booking and management
- Treatment and medical record handling
- Billing management
- Spring Security-based authentication and authorization
- RESTful API architecture
- Oracle Database integration
- Exception handling and input validation

## Tech Stack

### Backend
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Spring Security

### Database
- Oracle Database

### Tools
- Maven
- Eclipse / IntelliJ IDEA
- Postman
- Git & GitHub

## Project Modules

### Patient Module
- Add new patient
- View all patients
- View patient by ID
- Update patient details
- Delete patient records

### Doctor Module
- Add new doctor
- View all doctors
- View doctor by ID
- Update doctor details
- Delete doctor records

### Appointment Module
- Book appointments
- View all appointments
- View appointment by ID
- Update appointment details
- Cancel appointments

### Billing Module
- Generate bills
- View billing details
- Update billing status

### Security Module
- User authentication
- Role-based authorization
- Protected REST API endpoints

## Architecture

This project follows a layered architecture:

- Controller Layer
- Service Layer
- Repository Layer
- Entity Layer
- Security Configuration Layer
- Exception Handling Layer
- Dto Layer

## Base URL

```bash
http://localhost:8080/api/v1
