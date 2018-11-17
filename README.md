# Policy Service

A RESTful microservice for a insurance policy

## Requirements

- Use Spring Boot and Java to create a RESTful CrUD microservice, backed by an in-memory H2 database
- The service should perform its operations on a Policy entity
- The Policy entity:
    - A unique policy number
    - First and last name of the Insured
    - Start date and end date of the policy
    - A value representing the deductible value of the policy, in USD
- Commit the initial project setup, and subsequent enhancements to a GitHub repository, with public view access
- Feel free to make any notes of assumptions as needed

## Tasks

### Policy Model

- x TODO Create the Policy class
  - x TODO Define unique policy number (surrogate integer, serialized?)
  - x TODO Define first/last name as Strings
  - x TODO Define start and end date using LocalDate class
  - x TODO Define deductible value using Currency class and USD denomination
- TODO Create test case for Policy Class

### REST Service Controller

- TODO Connect

### H2 Database

- x TODO Install and Connect to H2
- TODO Initialize Policy Table
- TODO Initialize Policy Data