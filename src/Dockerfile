# Stage 1: Build the application using Maven
FROM openjdk:19-jdk AS build

# Set the working directory
WORKDIR /app

# Copy the Maven wrapper and pom.xml
COPY .mvn/wrapper .
COPY pom.xml .

# Set execution permission for the Maven wrapper
RUN chmod +x ./mvn/wrapper/mvnw

# Download dependencies (using the pom.xml)
RUN ./mvn/wrapper/mvnw dependency:go-offline

# Copy the source code
COPY . .

# Build the application
RUN ./mvn/wrapper/mvnw clean package -DskipTests

# Stage 2: Create the final Docker image using OpenJDK 19
FROM openjdk:19-jdk
VOLUME /tmp

# Copy the JAR from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app.jar"]