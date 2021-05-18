# Simple CRUD API
A simple CRUD API made with Spring Boot

* [Installation](#Installation)
* [Usage](#Usage)
    * [Resources](#Resources)
    * [Postman](#Postman)

## Installation
* Install Java (JDK 11)
* Open IntelliJ IDEA
* Open Project
* Install dependencies ([pom.xml](pom.xml))
* Run 
    * Default endpoint is [localhost:8080](http://localhost:8080)

## Usage
This application has no HTML or visual management screen.
The UI for this API is located at [simple-crud-ui](https://github.com/NickDeWyngaert/simple-crud-ui)

### Resources
| Movies               | Method        | URL               |
| -------------------- | ------------- | ----------------- |
| Get all movies       | `GET`         | `/movies`         |
| Create movie         | `POST`        | `/movies`         |
| Get movie with ID    | `GET`         | `/movies/:id`     |
| Update movie with ID | `PUT`         | `/movies/:id`     |
| Delete movie with ID | `DELETE`      | `/movies/:id`     |

### Postman
* Export version: v2.1
* Import
    * Open Postman
    * File -> Import
    * [Simple-CRUD-API.postman_collection.json](Simple-CRUD-API.postman_collection.json)
