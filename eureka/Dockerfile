FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8761
ADD target/eureka-0.0.1-SNAPSHOT.jar eureka-server.jar
ENTRYPOINT ["java", "-jar", "eureka-server.jar"]