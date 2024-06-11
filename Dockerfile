# Importing JDK and copying required files
FROM openjdk:19-jdk AS build
WORKDIR /app
COPY src src

# Stage 2: Create the final Docker image using OpenJDK 19
FROM openjdk:19-jdk
VOLUME /tmp

# Copy the JAR from the build stage
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080

RUN apt-get update -y && \
    apt-get upgrade -y && \
    apt-get install maven -y