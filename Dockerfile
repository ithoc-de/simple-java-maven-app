FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY target/simple-java-maven-app.jar .
CMD ["java", "-jar", "simple-java-maven-app.jar"]
