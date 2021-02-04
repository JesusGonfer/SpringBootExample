#MULTISTAGE BUILD
FROM maven:3.6.0-jdk-11-slim AS builder
COPY ./backend .
RUN mvn clean package

#----------------------
FROM openjdk:11-jdk-slim
COPY --from=builder /target/backend-0.0.1-SNAPSHOT.war /app.war
ENTRYPOINT ["java", "-jar", "app.war"]
EXPOSE 8085