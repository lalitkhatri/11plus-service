# Use a multi-stage build for smaller images
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/service-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 5001
ENTRYPOINT ["java", "-jar", "app.jar"]

