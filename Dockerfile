FROM openjdk:8

ADD /target /helloredis
WORKDIR /helloredis

ENTRYPOINT ["java", "-jar", "helloredis-0.1-SNAPSHOT.jar"]