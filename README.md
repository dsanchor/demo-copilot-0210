# Spring Boot Rest API Demo

## Build the application

```bash
mvn clean package
```

## Run the application

```bash
mvn spring-boot:run
```

## Test the application

```bash
curl http://localhost:8080/hello
```

## Test the reverse operation

```bash
curl http://localhost:8080/reverse?text=hello
```

## Test the remove vowels operation

```bash
curl http://localhost:8080/removeVowels?text=hello
```

## Run unit test

```bash
mvn test
```

## Dockerize the application

```bash
docker build -t spring-boot-rest-api-demo .
```

## Run the dockerized application

```bash
docker run -p 8080:8080 spring-boot-rest-api-demo
```

