FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} agency-service.jar
ENTRYPOINT ["java","-jar","/agency-service.jar"]
EXPOSE 9010