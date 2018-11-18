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

## Assumptions

- Policy numbers are pre-existing and therefore not auto-generated, generated programmatically on front-end on policy creation
- JSON is the standard format for object representation
- Most validation is performed on the front end. Added example to showcase input validation into API

## Tasks

### Policy Model

- x TODO Create the Policy class
  - x TODO Define unique policy number (surrogate integer, serialized?)
  - x TODO Define first/last name as Strings
  - x TODO Define start and end date using LocalDate class
  - x TODO Define deductible value using Currency class and USD denomination
  - Added Lombok to skill getters/setters/toString
- TODO Create test case for Policy Class

### REST Service Controller

- x TODO Create web server (Tomcat)
- x TODO Test connection to Rest Controller
    - Added Jackson to marshall objects into JSON
- TODO Add validation of PUT/PUSH... Embed in model?
   
### REST CRUD Services

| Complete | CRUD | Method | URL |
|:--------:|:-----|:-------|:----|
| x | CREATE | POST | /policies |
|  | READ | GET | /policies/{policyNo} |
| x | READ | GET | /policies |
|  | READ | GET | /policies/{lastName} |
|  | READ | GET | /policies/{startdate}/{endDate} |
|  | UPDATE | PUT | /policies/{policyNo} |
|  | DELETE | DELETE | /policies/{policyNo} |

### H2 Database

- x TODO Install and Connect to H2
- x TODO Initialize Policy Table & Data
    - Renamed data.sql to data-h2.sql
    - Added JDBC Dependency to populate with *.sql files
- x TODO Create Repository and link to controller