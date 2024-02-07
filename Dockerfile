FROM openjdk:latest
Expose 8080
Add target/demo-0.0.1-SNAPSHOT.jar myapp.jar
Entrypoint ["java","-jar","myapp.jar"]