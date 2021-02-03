From openjdk:11

ADD backend/target/backend-0.0.1-SNAPSHOT.war app.war

ENTRYPOINT ["java", "-jar", "app.war"]

EXPOSE 8085