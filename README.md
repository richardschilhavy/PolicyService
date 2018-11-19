# Policy Service

A RESTful microservice for a insurance policy

## Build Details

- Tomcat 9.x as local server for testing
- Maven build processor to resolve dependencies (e.g. Spring, Rest, H2, Lombok)
- Enable Annotation Processing AND install Lombok plugin
- Build to WAR file, then copied to to tomcat/webapps
- See REST CRUD Services for details on using API

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
- Most validation is performed on the front end.

## Future Improvements

- Add Logger to PolicyServiceController classs
- Add annotation validations to model 
- Add annotation to validate RequestBody
- Add/modify CREATE service to support multiple policies in same request
- Expand on READ services for sorting, similarity (e.g. LIKE)

## Tasks

### Policy Model

- x TODO Create the Policy class
  - x TODO Define unique policy number (surrogate integer, serialized?)
  - x TODO Define first/last name as Strings
  - x TODO Define start and end date using LocalDate class
  - x TODO Define deductible value using Currency class and USD denomination
  - Added Lombok to skill getters/setters/toString
- TODO Add validation to Policy class
- TODO Create test case for Policy class

### REST Service Controller

- x TODO Create web server (Tomcat)
- x TODO Test connection to Rest Controller
    - Added Jackson to marshall objects into JSON
   
### REST CRUD Services

| Complete | CRUD | Method | URL | Description |
|:--------:|:-----|:-------|:----|:------------|
| x | CREATE | POST | /policies | Adds one or more policies as Policy JSON object array |
| x | READ | GET | /policies/{policyNo} | Returns one policy using policy number |
| x | READ | GET | /policies | Returns all policies |
| x | READ | GET | /policies/lastname/{lastName} | Returns one or more policies with matching last name |
| x | READ | GET | /policies/date/{startdate}/{endDate} | Returns one or more policies with enddate between two dates | |
| x | UPDATE | PUT | /policies/{policyNo} | Updates existing policy with one Policy JSON object |
| x | DELETE | DELETE | /policies/{policyNo} | Delete policy using policy number |

### H2 Database

- x TODO Install and Connect to H2
- x TODO Initialize Policy Table & Data
    - Renamed data.sql to data-h2.sql
    - Added JDBC Dependency to populate with *.sql files
- x TODO Create Repository and link to controller
