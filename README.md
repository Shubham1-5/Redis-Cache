# Redis-Cache

Demo User project using Spring Boot and internal mock DB along with REST APIs along with Redis cache implementation

## Techs used

- IntellIJ
- Spring Boot
- Maven
- Redis
- Postman

## Installation

- Install Java (minimum requirement is Java 8)
- Setup environment variables for Java configuration
- Install IntellIJ
- Clone this repository and then refresh maven
- Start the server

## API calls

- localhost:8080/{id}

## Requirement

To optimize time for each API call based upon User followers number. ( Note : Intentionally API calls are made to response after 10 secs at service layer )

## Demo Result

<div style='width: 130px; text-align: center;'>Result from local redis-cli</div>
<br>
<img src = "/src/main/resources/Achieved Result/cached from terminal.png">
<br>
<br>

<div style='width: 130px; text-align: center;'>For uncached result</div>
<br>
<img src = "/src/main/resources/Achieved Result/for userId 1.png">
<br>
<br>

<div style='width: 130px; text-align: center;'>For cached result</div>
<br>
<img src = "/src/main/resources/Achieved Result/for userId 2.png">
