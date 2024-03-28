# JPA Paging Application

This Spring Boot application demonstrates the use of JPA Paging to efficiently handle data retrieval. 
Implementing pagination allows large datasets to be broken down into manageable segments, enhancing performance and usability in web applications.

## Technologies

- **Java**: Version 17
- **Spring Boot**: Used for the web framework and JPA integration
- **Maven**: For build management
- **H2 Database**: For persistent data storage in a development environment
- **Faker**: To generate sample data

## Main Components

- **PersonController**: A REST controller providing endpoints to interact with person data, including pagination capabilities.
- **SampleDataLoader**: A component that automatically loads sample data into the database at application startup, using the Faker library.
- **PersonRepository**: A JPA repository for CRUD operations on person data, including paging and sorting.
- **Model**: Domain models `Person` and `Address` defining the data structure.

## Prerequisites

To run this project, you'll need:

- JDK 17 or newer
- Maven 3.6 or newer

## Usage
The application offers endpoints for viewing and managing person data, which you can test using tools like Postman or Curl.

Request Examples
List of persons with paging:
GET http://localhost:8080/people?page=0&size=2

Add a new person:
POST http://localhost:8080/people

## Installation and Execution

1. **Clone the repository**:

```bash
git clone https://github.com/yourUsername/jpa-paging-app.git
cd jpa-paging-app
