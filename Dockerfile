FROM openjdk:11-jre

WORKDIR /app

COPY service-a/build/libs/service-c-0.0.1-SNAPSHOT.jar /service-a-0.0.1-SNAPSHOT.jar
COPY service-b/build/libs/service-c-0.0.1-SNAPSHOT.jar /service-b-0.0.1-SNAPSHOT.jar
COPY service-c/build/libs/service-c-0.0.1-SNAPSHOT.jar /service-c-0.0.1-SNAPSHOT.jar

EXPOSE 8080
