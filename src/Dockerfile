# Stage 1: Build the application using Maven
FROM openjdk:19-jdk AS build

# Set the working directory
WORKDIR /app

# Copy the Maven wrapper and pom.xml from the parent directory
COPY ../mvnw .
COPY ../.mvn .mvn
COPY ../pom.xml .

# Set execution permission for the Maven wrapper
RUN chmod +x ./mvnw

# Download dependencies (using the pom.xml)
RUN ./mvnw dependency:go-offline

# Copy the source code from the current directory (src)
COPY . .

# Build the application
RUN ./mvnw clean package -DskipTests

# Stage 2: Create the final Docker image using OpenJDK 19
FROM openjdk:19-jdk
VOLUME /tmp

# Copy the JAR from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose the application port
EXPOSE 8080

# Install additional packages if needed
RUN apt-get update && \
    apt-get upgrade -y && \
    apt-get install -y git

# Run the application
ENTRYPOINT ["java", "-jar", "/app.jar"]