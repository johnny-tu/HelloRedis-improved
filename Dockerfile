FROM openjdk:8

ADD target/*.jar /helloredis
WORKDIR /helloredis

ENTRYPOINT ["java", "-jar", "App"]