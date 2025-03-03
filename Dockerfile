# Build stage
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY pom.xml . 
COPY src ./src
RUN mvn clean package -DskipTests

# Run stage
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy the built jar file into the container
COPY --from=build /app/target/chat-0.0.1-SNAPSHOT.jar /app/chat.jar  

# Expose the port Spring Boot runs on
EXPOSE 8080

# Command to run the jar file
ENTRYPOINT ["java", "-jar", "/app/chat.jar"]
