FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} location-service.jar
ENTRYPOINT ["java","-jar","/location-service.jar"]
EXPOSE 9030