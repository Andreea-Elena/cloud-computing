FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} configuration.jar
ENTRYPOINT ["java","-jar","/configuration.jar"]
EXPOSE 9296