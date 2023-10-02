FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/demo0210-0.0.1-SNAPSHOT.jar /app/myapp.jar

CMD ["java", "-jar", "/app/myapp.jar"]