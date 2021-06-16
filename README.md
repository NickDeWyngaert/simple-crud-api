# Simple CRUD API

* [About](#About)
* [Getting Started](#Getting-Started)
    * [Prerequisites](#Prerequisites)
    * [Installation](#Installation)
* [Usage](#Usage)
    * [Resources](#Resources)
    * [Postman](#Postman)

## About
A simple CRUD API made with Spring Boot

## Getting Started
To get a local copy up and running follow these simple example steps.

### Prerequisites
* Java (JDK 11)
* Maven

### Installation
1. Clone the repository
   ```sh
   git clone https://github.com/NickDeWyngaert/simple-crud-api.git
   ```
2. Open your IDE
3. Install dependencies ([pom.xml](pom.xml))
4. Run (Default endpoint is [localhost:8080](http://localhost:8080))

## Usage
* This application has no HTML or visual management screen.
* The UI for this API is located at [simple-crud-ui](https://github.com/NickDeWyngaert/simple-crud-ui)

### Resources
| Movies               | Method        | URL               |
| -------------------- | ------------- | ----------------- |
| Get all movies       | `GET`         | `/movies`         |
| Create movie         | `POST`        | `/movies`         |
| Get movie with ID    | `GET`         | `/movies/:id`     |
| Update movie with ID | `PUT`         | `/movies/:id`     |
| Delete movie with ID | `DELETE`      | `/movies/:id`     |

### Postman
* [Simple-CRUD-API.postman_collection.json](Simple-CRUD-API.postman_collection.json)
* Export version: v2.1

### OpenAPI
* [Simple-CRUD-API.yaml](Simple-CRUD-API.yaml)
* Version: 3.0.1