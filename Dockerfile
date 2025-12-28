# Stage 1: Build using Maven and Temurin JDK 17
FROM maven:3.8.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Runtime using Temurin JRE 17 (smaller and more secure)
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# Note: Ensure your pom.xml generates a jar. Usually it's in the target folder.
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]