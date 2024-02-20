# Use a base image with OpenJDK 11
FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/HarbourEats-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]
