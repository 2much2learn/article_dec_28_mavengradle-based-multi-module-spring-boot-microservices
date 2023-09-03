FROM openjdk:11-jre

WORKDIR /app

ADD service-a/build/libs/service-c-0.0.1-SNAPSHOT.jar /service-a-0.0.1-SNAPSHOT.jar
ADD service-b/build/libs/service-c-0.0.1-SNAPSHOT.jar /service-b-0.0.1-SNAPSHOT.jar
ADD service-c/build/libs/service-c-0.0.1-SNAPSHOT.jar /service-c-0.0.1-SNAPSHOT.jar

EXPOSE 8080
