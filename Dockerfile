# Use a base image with OpenJDK 11
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/HarbourEats-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port on which the application will run
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]
